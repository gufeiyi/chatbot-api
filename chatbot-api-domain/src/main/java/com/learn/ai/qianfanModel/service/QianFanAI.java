package com.learn.ai.qianfanModel.service;



// 换了alibaba的json来处理
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import com.learn.ai.qianfanModel.IQianFanAI;
import okhttp3.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * ClassName:QianFanAI
 * Package:com.learn.ai.qianfanModel.service
 * Description:
 *
 * @Author: 雪儿
 * @Create: 2024/2/25 10:01
 * @Version 1.0
 */
@Service
public class QianFanAI implements IQianFanAI {
    public static final String API_KEY = "nOO3f9mA8YZoxZxbwX3dVVlE";
    public static final String SECRET_KEY = "z3sq5QS5gTq2SGuDgc9POb3Tk6Id5KSH";

    static final OkHttpClient HTTP_CLIENT = new OkHttpClient().newBuilder()
            .connectTimeout(20, TimeUnit.MINUTES)
            .readTimeout(20,TimeUnit.MINUTES)
            .writeTimeout(20,TimeUnit.MINUTES)
            .build();
    @Override
    public String doQianFanAnswer(String question) throws IOException, JSONException {

        MediaType mediaType = MediaType.parse("application/json");
        String paramJson = "{\"messages\":[{\"role\":\"user\",\"content\":\""+question+"\"}],\"disable_search\":false,\"enable_citation\":false}";
        RequestBody body = RequestBody.create(mediaType, paramJson);
        Request request = new Request.Builder()
                .url("https://aip.baidubce.com/rpc/2.0/ai_custom/v1/wenxinworkshop/chat/completions_pro?access_token=" + getAccessToken())
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = HTTP_CLIENT.newCall(request).execute();
        System.out.println(response.body().string());

        return null;
    }

    static String getAccessToken() throws IOException, JSONException {
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=client_credentials&client_id=" + API_KEY
                + "&client_secret=" + SECRET_KEY);
        Request request = new Request.Builder()
                .url("https://aip.baidubce.com/oauth/2.0/token")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        Response response = HTTP_CLIENT.newCall(request).execute();
        return new JSONObject(Boolean.parseBoolean(response.body().string())).getString("access_token");
    }
}
