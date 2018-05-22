package com.hansen.mvpframe.base.contract.main;

import com.hansen.mvpframe.base.BasePresenter;
import com.hansen.mvpframe.base.BaseView;

/**
 * Created by codeest on 16/10/17.
 */

public interface SettingContract {

    interface View extends BaseView {

//        void showUpdateDialog(VersionBean bean);


    }

    interface  Presenter extends BasePresenter<SettingContract.View> {

        boolean  getAutoCacheState();
        void setAutoCacheState(boolean state);

        //无图模式
        boolean getNoImageState();
        void setNoImageState(boolean state);
        //夜间模式
       boolean getNightModeState();
       void setNightModeState(boolean state);
    }
}
