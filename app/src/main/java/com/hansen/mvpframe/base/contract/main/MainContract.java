package com.hansen.mvpframe.base.contract.main;

import com.hansen.mvpframe.base.BasePresenter;
import com.hansen.mvpframe.base.BaseView;
import com.tbruyelle.rxpermissions2.RxPermissions;

/**
 * Created by codeest on 16/8/9.
 */

public interface MainContract {

    interface View extends BaseView{

        void showUpdateDialog(String versionContent);

        void startDownloadService();
    }

    interface  Presenter extends BasePresenter<View> {

        int getCurrentItem();
        void setCurrentItem(int index);


    }
}
