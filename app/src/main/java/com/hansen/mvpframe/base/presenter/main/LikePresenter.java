package com.hansen.mvpframe.base.presenter.main;

import com.hansen.mvpframe.base.RxPresenter;
import com.hansen.mvpframe.model.DataManager;
import com.hansen.mvpframe.base.contract.main.LikeContract;

import javax.inject.Inject;

/**
 * Created by codeest on 2016/8/23.
 */
public class LikePresenter extends RxPresenter<LikeContract.View> implements LikeContract.Presenter{

    private DataManager mDataManager;

    @Inject
    public LikePresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }








}
