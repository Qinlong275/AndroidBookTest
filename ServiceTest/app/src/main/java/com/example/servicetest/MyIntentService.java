package com.example.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by 秦龙 on 2017/8/16.
 */

public class MyIntentService extends IntentService{

    public MyIntentService() {
        super("MyIntentService");//調用父類的有參構造器
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        //打印當前綫程的id
        Log.d("MyIntentService","Thread id is "+Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyIntentService","onDestroy executed");
    }
}
