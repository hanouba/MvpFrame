package com.hansen.mvpframe.base.presenter.zhihu;

import com.hansen.mvpframe.base.RxPresenter;
import com.hansen.mvpframe.base.contract.zhihu.DataInfoContract;
import com.hansen.mvpframe.base.contract.zhihu.NewInfoContract;
import com.hansen.mvpframe.model.DataManager;

import javax.inject.Inject;

/**
 * 创建者 by ${HanSir} on 2018/5/17.
 * 版权所有  WELLTRANS.
 * 说明      日报
 */

public class DataInfoPresenter extends RxPresenter<DataInfoContract.View> implements  DataInfoContract.Presenter{
    private DataManager mDataManager;

    @Inject
    public DataInfoPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }


}
