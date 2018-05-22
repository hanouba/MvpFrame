package com.hansen.mvpframe.base.presenter.main;

import com.hansen.mvpframe.base.RxPresenter;
import com.hansen.mvpframe.component.RxBus;
import com.hansen.mvpframe.model.DataManager;
import com.hansen.mvpframe.model.event.NightModeEvent;
import com.hansen.mvpframe.base.contract.main.MainContract;
import com.hansen.mvpframe.util.RxUtil;
import com.hansen.mvpframe.widget.CommonSubscriber;

import javax.inject.Inject;

import io.reactivex.functions.Function;

/**
 * Created by codeest on 16/8/9.
 */

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter{

    private DataManager mDataManager;

    @Inject
    public MainPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void attachView(MainContract.View view) {
        super.attachView(view);
        registerEvent();
    }

    private void registerEvent() {
        addSubscribe(RxBus.getDefault().toFlowable(NightModeEvent.class)
                .compose(RxUtil.<NightModeEvent>rxSchedulerHelper())
                .map(new Function<NightModeEvent, Boolean>() {
                    @Override
                    public Boolean apply(NightModeEvent nightModeEvent) {
                        return nightModeEvent.getNightMode();
                    }
                })
                .subscribeWith(new CommonSubscriber<Boolean>(mView, "切换模式失败ヽ(≧Д≦)ノ") {
                    @Override
                    public void onNext(Boolean aBoolean) {
                        //通过基类的方法 全局设置夜间模式状态
                        mView.useNightMode(aBoolean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        registerEvent();
                    }
                })
        );
    }


    @Override
    public int getCurrentItem() {
        return mDataManager.getCurrentItem();
    }

    @Override
    public void setCurrentItem(int index) {
        mDataManager.setCurrentItem(index);
    }

    @Override
    public boolean getNightModeState() {
        return mDataManager.getNightModeState();
    }

    @Override
    public void setNightModeState(boolean state) {
        mDataManager.setNightModeState(state);
    }
}
