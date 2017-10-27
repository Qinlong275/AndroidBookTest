package com.example.servicebestpractice;

/**
 * Created by 秦龙 on 2017/8/16.
 */

public interface DownloadListener {

    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPause();
    void onCanceled();
}
