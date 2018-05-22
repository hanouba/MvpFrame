package com.hansen.mvpframe.model.http;

import com.hansen.mvpframe.model.bean.NewInfoBean;
import com.hansen.mvpframe.model.bean.WelcomeBean;

import io.reactivex.Flowable;

/**
  网络请求
 */

public interface HttpHelper {

    //首页splash
    Flowable<WelcomeBean> fetchGetWelcome(String res);
    //获取最新消息
    Flowable<NewInfoBean> fetchGetNewInfo();






}
