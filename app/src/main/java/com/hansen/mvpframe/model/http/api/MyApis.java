package com.hansen.mvpframe.model.http.api;

import com.hansen.mvpframe.model.bean.NewInfoBean;
import com.hansen.mvpframe.model.bean.WelcomeBean;
import com.hansen.mvpframe.model.http.response.MyHttpResponse;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by codeest on 16/10/10.
 * https://github.com/codeestX/my-restful-api
 */

public interface MyApis {

    String HOST = "http://news-at.zhihu.com/api/4/";

    String APK_DOWNLOAD_URL = "http://codeest.me/apk/geeknews.apk";


    /**
     * 启动界面图片
     */
    @GET("prefetch-launch-images/{res}")
    Flowable<WelcomeBean> getWelcomeInfo(@Path("res") String res);

    //https://news-at.zhihu.com/api/4/news/latest
    //最新消息
    @GET("news/latest")
    Flowable<NewInfoBean> getNewInfo();

}
