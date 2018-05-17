package com.hansen.mvpframe.base.contract.main;

import com.hansen.mvpframe.base.BasePresenter;
import com.hansen.mvpframe.base.BaseView;
import com.hansen.mvpframe.model.bean.WelcomeBean;

/**
 * Created by codeest on 16/8/15.
 */

public interface WelcomeContract {

    interface View extends BaseView {

        void showContent(WelcomeBean welcomeBean);

        /**
         * 调到主页
         */
        void jumpToMain();

    }

    interface  Presenter extends BasePresenter<View> {

        void getWelcomeData();

    }
}
