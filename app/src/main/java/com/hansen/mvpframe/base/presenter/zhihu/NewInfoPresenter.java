package com.hansen.mvpframe.base.presenter.zhihu;

import com.hansen.mvpframe.base.RxPresenter;
import com.hansen.mvpframe.base.contract.zhihu.NewInfoContract;
import com.hansen.mvpframe.model.DataManager;

/**
 * 创建者 by ${HanSir} on 2018/5/17.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class NewInfoPresenter extends RxPresenter<NewInfoContract.View> implements  NewInfoContract.Presenter{
    private DataManager mDataManager;

    public NewInfoPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }


}
