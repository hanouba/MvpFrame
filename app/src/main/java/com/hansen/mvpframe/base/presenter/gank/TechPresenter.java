package com.hansen.mvpframe.base.presenter.gank;

import com.hansen.mvpframe.app.Constants;
import com.hansen.mvpframe.base.RxPresenter;
import com.hansen.mvpframe.component.RxBus;
import com.hansen.mvpframe.model.DataManager;
import com.hansen.mvpframe.model.event.SearchEvent;
import com.hansen.mvpframe.base.contract.gank.TechContract;
import com.hansen.mvpframe.ui.gank.fragment.GankMainFragment;
import com.hansen.mvpframe.util.RxUtil;
import com.hansen.mvpframe.widget.CommonSubscriber;

import javax.inject.Inject;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/**
 * Created by codeest on 16/8/20.
 */

public class TechPresenter extends RxPresenter<TechContract.View> implements TechContract.Presenter{

    private DataManager mDataManager;
    private static final int NUM_OF_PAGE = 20;

    private int currentPage = 1;
    private String queryStr = null;
    private String currentTech = GankMainFragment.tabTitle[0];
    private int currentType = Constants.TYPE_ANDROID;

    @Inject
    public TechPresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void attachView(TechContract.View view) {
        super.attachView(view);
        registerEvent();
    }

    private void registerEvent() {
        addSubscribe(RxBus.getDefault().toFlowable(SearchEvent.class)
                .compose(RxUtil.<SearchEvent>rxSchedulerHelper())
                .filter(new Predicate<SearchEvent>() {
                    @Override
                    public boolean test(@NonNull SearchEvent searchEvent) throws Exception {
                        return searchEvent.getType() == currentType;
                    }
                })
                .map(new Function<SearchEvent, String>() {
                    @Override
                    public String apply(SearchEvent searchEvent) {
                        return searchEvent.getQuery();
                    }
                })
                .subscribeWith(new CommonSubscriber<String>(mView, "搜索失败") {
                    @Override
                    public void onNext(String s) {
                        queryStr = s;
                        getSearchTechData();
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        registerEvent();
                    }
                })
        );
    }

    private void getSearchTechData() {
        currentPage = 1;

    }

    @Override
    public void getGankData(String tech, int type) {
        queryStr = null;
        currentPage = 1;
        currentTech = tech;
        currentType = type;

    }

    @Override
    public void getMoreGankData(String tech) {
        if(queryStr != null) {
            getMoreSearchGankData();
            return;
        }

    }

    private void getMoreSearchGankData() {

    }

    @Override
    public void getGirlImage() {

    }
}
