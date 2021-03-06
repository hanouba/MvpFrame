package com.hansen.mvpframe.model.http;

import com.hansen.mvpframe.model.bean.NewInfoBean;
import com.hansen.mvpframe.model.bean.WelcomeBean;
import com.hansen.mvpframe.model.http.api.GankApis;
import com.hansen.mvpframe.model.http.api.MyApis;
import com.hansen.mvpframe.model.http.response.GankHttpResponse;
import com.hansen.mvpframe.model.http.response.MyHttpResponse;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 这里来处理 请求的地址到底用那个根地址
 */
public class RetrofitHelper implements HttpHelper {
    //声明需要用到的多个请求地址API
    private GankApis mGankApiService;
    private MyApis mMyApiService;


    @Inject
    public RetrofitHelper( GankApis gankApiService, MyApis myApiService) {
        this.mGankApiService = gankApiService;
        this.mMyApiService = myApiService;
    }


    @Override
    public Flowable<WelcomeBean> fetchGetWelcome(String res) {
        return mMyApiService.getWelcomeInfo(res);
    }

    @Override
    public Flowable<NewInfoBean> fetchGetNewInfo() {
        return mMyApiService.getNewInfo();
    }
}
