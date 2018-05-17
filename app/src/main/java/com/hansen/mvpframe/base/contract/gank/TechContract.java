package com.hansen.mvpframe.base.contract.gank;

import com.hansen.mvpframe.base.BasePresenter;
import com.hansen.mvpframe.base.BaseView;

import java.util.List;

/**
 * Created by codeest on 16/8/20.
 */

public interface TechContract {

    interface View extends BaseView {



        void showGirlImage(String url, String copyright);
    }

    interface Presenter extends BasePresenter<View> {

        void getGankData(String tech, int type);

        void getMoreGankData(String tech);

        void getGirlImage();

    }
}
