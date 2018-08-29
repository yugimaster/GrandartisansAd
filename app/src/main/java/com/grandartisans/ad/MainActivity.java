package com.grandartisans.ad;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.grandartisans.ad.bean.ADPosition;
import com.grandartisans.ad.bean.ADScheduleData;
import com.grandartisans.ad.bean.DataToken;
import com.grandartisans.ad.bean.DateScheItem;
import com.grandartisans.ad.bean.FileListItem;
import com.grandartisans.ad.bean.PkgAdItem;
import com.grandartisans.ad.bean.RegionList;
import com.grandartisans.ad.bean.ScheduleApiResult;
import com.grandartisans.ad.bean.TimeScheItem;
import com.grandartisans.ad.bean.TokenApiResult;
import com.grandartisans.ad.ui.UIUtil;
import com.grandartisans.ad.utils.TimeUtils;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import org.json.JSONObject;
import org.json.JSONException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private Button button;

    private JSONObject jsonObject;
    private ADScheduleData adScheduleData;

    private List<RegionList> regionList;
    private List<String> relationIdList;

    private Map<String, String> relationMap;
    private Map<String, ADPosition> adPosMap;

    private static final String HOST = "http://api.dsp.grandartisans.cn";
    private static final String API_TOKEN = "/v1/api/token";
    private static final String API_SCHEDULE_TIMES = "/v1/api/schedule/times";
    private static final String DEVICE_CLIENT_TID = "TESTHFGA002";
    private static final String TAG = "Grandartisans";

    private static final int KEY = 123456;
    private static final int RENDER_UI = 1;

    private void init_view() {
        relativeLayout = findViewById(R.id.frame);
        button = findViewById(R.id.button);

        jsonObject = new JSONObject();
        relationIdList = new ArrayList<String>();
        long nowTime = TimeUtils.getCurrentTimeInLong();

        init_token_post_param(jsonObject, nowTime);
        btnClick(button, jsonObject);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // View landscape

        init_view();
    }

    private void init_token_post_param(JSONObject jsonObject, long nowTime) {
        try {
            jsonObject.put("deviceClientid", DEVICE_CLIENT_TID);
            jsonObject.put("sign", DEVICE_CLIENT_TID + "$" + nowTime + "$" + KEY);
            jsonObject.put("timestamp", nowTime);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void init_schedule_post_param(JSONObject jsonObject, long nowTime, String token) {
        try {
            jsonObject.put("deviceClientid", DEVICE_CLIENT_TID);
            jsonObject.put("token", token);
            jsonObject.put("timestamp", nowTime);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void btnClick(Button button, final JSONObject jsonObject) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = HOST + API_TOKEN;
                OkGo.<String>post(url)
                        .upJson(jsonObject.toString())
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(Response<String> response) {
                                String json_obj_str = response.body().toString();
                                TokenApiResult<DataToken> tokenResult = parseJson(json_obj_str);
                                if (tokenResult.ismSuccess() && tokenResult.getmData() != null) {
                                    String token = tokenResult.getmData().getToken();
                                    getSchedule(token);
                                }
                            }
                            @Override
                            public void onError(Response<String> response) {
                                Log.e(TAG, "Get json data failed");
                            }
                        });
            }
        });
    }

    private void getSchedule(String token) {
        long nowTime = TimeUtils.getCurrentTimeInLong();
        init_schedule_post_param(jsonObject, nowTime, token);

        OkGo.<String>post(HOST + API_SCHEDULE_TIMES)
                .upJson(jsonObject.toString())
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        String json_obj_str = response.body();
                        Log.e(TAG, "Schedule Times: " + response.body());
                        Gson gson = new Gson();
                        ScheduleApiResult scheduleResult = gson.fromJson(json_obj_str,
                                ScheduleApiResult.class);
                        if (scheduleResult.isSuccess() && scheduleResult.getData() != null) {
                            Log.e(TAG, "Get schedule data success");

                            // Get ad schedule data
                            adScheduleData = scheduleResult.getData();

                            // Get region map
                            relationMap = adScheduleData.getRelationMap();

                            // Get region list
                            regionList = adScheduleData.getTemplate().getRegionList();

                            // Get ad position map
                            adPosMap = adScheduleData.getAdPosMap();
                            handler.sendEmptyMessage(RENDER_UI);
                        }
                    }

                    @Override
                    public void onError(Response<String> response) {
                        Log.e(TAG, "Get schedule data failed");
                    }
                });
    }

    private void renderUI(List<RegionList> regionList,
                          Map<String, String> relationMap,
                          Map<String, ADPosition> adPosMap) {
        Log.e(TAG, "render UI");
        for (int i=0; i< regionList.size(); i++) {
            RegionList object = regionList.get(i);
            int reg_width = object.getWidth();
            int reg_height = object.getHeight();
            String reg_name = object.getName();
            String reg_location = object.getLocation();
            String reg_rate = object.getRate();
            String reg_ident = object.getIdent();
            reg_location.replace("，", ",");
            String[] locations = reg_location.split(",");
            int margin_left = Integer.valueOf(locations[0]);
            int margin_top = Integer.valueOf(locations[1]);

            // Get relation map id
            String relationId = relationMap.get(reg_ident);
            relationIdList.add(relationId);

            // Get ad position
            ADPosition adPosition = adPosMap.get(relationId);
            // Get first date schedule item in vos from ad position
            DateScheItem dateScheItem = adPosition.getVos().get(0);
            // Get first time schedule item in vos from date schedule vos
            TimeScheItem timeScheItem = dateScheItem.getTimeScheVos().get(0);
            // Get first package ad item in time schedule vos
            PkgAdItem pkgAdItem = timeScheItem.getPkgAd().get(0);
            // Get first file list item in package ad
            FileListItem fileListItem = pkgAdItem.getFileList().get(0);

            long vtype = pkgAdItem.getAd().getVtype();
            String filePath = fileListItem.getFilePath();

            set_view_layout(vtype, reg_width, reg_height, margin_left, margin_top, filePath);
        }
    }

    public TokenApiResult<DataToken> parseJson(String jsonStr) {
        Gson gson = new Gson();
        Type jsonType = new TypeToken<TokenApiResult<DataToken>>() {}.getType();
        return gson.fromJson(jsonStr, jsonType);
    }

    private void set_view_layout(long view_type, int width, int height, int left, int top, String filePath) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
        layoutParams.setMargins(left, top, 0, 0);
        if (view_type == 1) {
            ImageView imageView = new ImageView(this);
            imageView.setLayoutParams(layoutParams);
            relativeLayout.addView(imageView);
            Glide.with(this).load(filePath).into(imageView);
        } else if (view_type == 2) {
            VideoView videoView = new VideoView(this);
            videoView.setLayoutParams(layoutParams);
            relativeLayout.addView(videoView);
            videoView.setVideoURI(Uri.parse(filePath));
            videoView.start();
        }
    }

    private void set_image_params(ImageView imageView, float scale, int margin_left,
                                                        int margin_top) {
        // Calculate the heigth of the screen
        int viewHeight = UIUtil.getScreenHeight(this);

        // Calculate the width of the image based on the height
        int viewWidth = (int)(viewHeight * scale);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(viewWidth, viewHeight);
        params.topMargin = (int)UIUtil.dp2px(this, margin_top);
        params.leftMargin = (int)UIUtil.dp2px(this, margin_left);

        imageView.setLayoutParams(params);
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case RENDER_UI:
                    renderUI(regionList, relationMap, adPosMap);
                    break;
            }
        }
    };
}
