package com.xiaolv.xiaolv.acitivtymanagement.HttpUtil;

import java.io.IOException;
import java.util.concurrent.Callable;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/7/28.
 */

public class ChangeUserStateThread implements Callable {

    String id,action;

    public ChangeUserStateThread(String id, String action) {
        this.id = id;
        this.action = action;
    }

    @Override
    public Object call() throws Exception {
        final OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("id", id)
                .add("action", action)
                .build();
        Request request = new Request.Builder()
                .url("http://120.25.192.181/xiaolv/admin/api/set_userState.php")
                .post(formBody)
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

        String Result=response.body().string();
        System.out.println("ChangeUserStateThread Result-------------:"+Result);
        return Result;
    }
}
