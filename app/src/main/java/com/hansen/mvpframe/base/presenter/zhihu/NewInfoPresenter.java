package com.hansen.mvpframe.base.presenter.zhihu;

import android.util.Log;

import com.hansen.mvpframe.base.RxPresenter;
import com.hansen.mvpframe.base.contract.zhihu.NewInfoContract;
import com.hansen.mvpframe.model.DataManager;
import com.hansen.mvpframe.model.bean.NewInfoBean;
import com.hansen.mvpframe.util.RxUtil;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.functions.Consumer;

/**
 * 创建者 by ${HanSir} on 2018/5/17.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class NewInfoPresenter extends RxPresenter<NewInfoContract.View> implements NewInfoContract.Presenter {
    private DataManager mDataManager;

    @Inject
    public NewInfoPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }


    @Override
    public void getNewInfo() {
        addSubscribe(mDataManager.fetchGetNewInfo()
                    .compose(RxUtil.<NewInfoBean>rxSchedulerHelper())
                    .subscribe(new Consumer<NewInfoBean>() {
                        @Override
                        public void accept(NewInfoBean newInfoBean) throws Exception {
                            Log.i("获取更新", "accept: "+newInfoBean.getDate());
                            List<NewInfoBean.TopStoriesBean> top_stories = newInfoBean.getTop_stories();
                            mView.showNewInfo(top_stories);
                        }


                    }));
    }
}
