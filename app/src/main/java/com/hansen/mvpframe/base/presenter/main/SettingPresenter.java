package com.hansen.mvpframe.base.presenter.main;

import com.hansen.mvpframe.base.RxPresenter;
import com.hansen.mvpframe.model.DataManager;
import com.hansen.mvpframe.base.contract.main.SettingContract;

import javax.inject.Inject;

/**
 * Created by codeest on 16/10/17.
 */

public class SettingPresenter extends RxPresenter<SettingContract.View> implements SettingContract.Presenter {

    private DataManager mDataManager;

    @Inject
    public SettingPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }


    @Override
    public boolean getAutoCacheState() {
      return   mDataManager.getAutoCacheState();
    }

    @Override
    public void setAutoCacheState(boolean state) {
        mDataManager.setAutoCacheState(state);
    }

    @Override
    public boolean getNoImageState() {
        return mDataManager.getNoImageState();
    }

    @Override
    public void setNoImageState(boolean state) {
        mDataManager.setNoImageState(state);
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
