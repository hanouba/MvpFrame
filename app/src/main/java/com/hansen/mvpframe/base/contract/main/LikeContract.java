package com.hansen.mvpframe.base.contract.main;

import com.hansen.mvpframe.base.BasePresenter;
import com.hansen.mvpframe.base.BaseView;

import java.util.List;

/**
 * Created by codeest on 2016/8/23.
 */
public interface LikeContract {

    interface View extends BaseView {


    }

    interface Presenter extends BasePresenter<View> {


    }
}
