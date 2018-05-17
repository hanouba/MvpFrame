package com.hansen.mvpframe.base.presenter.gank;

import com.hansen.mvpframe.base.RxPresenter;
import com.hansen.mvpframe.model.DataManager;
import com.hansen.mvpframe.base.contract.gank.GirlContract;

import javax.inject.Inject;

/**
 * Created by codeest on 16/8/19.
 */

public class GirlPresenter extends RxPresenter<GirlContract.View> implements GirlContract.Presenter{

    private DataManager mDataManager;

    public static final int NUM_OF_PAGE = 20;

    private int currentPage = 1;

    @Inject
    public GirlPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }




}
