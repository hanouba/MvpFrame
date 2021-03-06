package com.hansen.mvpframe.base.contract.zhihu;

import com.hansen.mvpframe.base.BasePresenter;
import com.hansen.mvpframe.base.BaseView;
import com.hansen.mvpframe.base.contract.gank.GirlContract;
import com.hansen.mvpframe.model.bean.NewInfoBean;

import java.util.List;

/**
 * 创建者 by ${HanSir} on 2018/5/17.
 * 版权所有  WELLTRANS.
 * 说明     最新消息
 */

public interface NewInfoContract {
    interface View extends BaseView {
        void showNewInfo(List<NewInfoBean.TopStoriesBean> topList);
    }

    interface Presenter extends BasePresenter<NewInfoContract.View> {
        void getNewInfo();

    }
}
