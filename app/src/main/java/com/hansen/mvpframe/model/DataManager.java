package com.hansen.mvpframe.model;

import com.hansen.mvpframe.model.bean.NewInfoBean;
import com.hansen.mvpframe.model.bean.WelcomeBean;
import com.hansen.mvpframe.model.db.DBHelper;
import com.hansen.mvpframe.model.http.HttpHelper;
import com.hansen.mvpframe.model.http.response.GankHttpResponse;
import com.hansen.mvpframe.model.http.response.MyHttpResponse;
import com.hansen.mvpframe.model.prefs.PreferencesHelper;

import java.util.List;

import io.reactivex.Flowable;

/**
 * 网络请求 数据库管理  各种状态查询
 * 返回值对应各个功能的返回值
 * 实现哪个接口返回哪个接口数据
 */

public class DataManager implements HttpHelper, DBHelper, PreferencesHelper {

    HttpHelper mHttpHelper;
    DBHelper mDbHelper;
    PreferencesHelper mPreferencesHelper;

    public DataManager(HttpHelper httpHelper, DBHelper dbHelper, PreferencesHelper preferencesHelper) {
        mHttpHelper = httpHelper;
        mDbHelper = dbHelper;
        mPreferencesHelper = preferencesHelper;
    }



    @Override
    public Flowable<WelcomeBean> fetchGetWelcome(String res) {
        return mHttpHelper.fetchGetWelcome(res);
    }

    @Override
    public Flowable<NewInfoBean> fetchGetNewInfo() {
        return mHttpHelper.fetchGetNewInfo();
    }

    @Override
    public int getCurrentItem() {
        return mPreferencesHelper.getCurrentItem();
    }

    @Override
    public void setCurrentItem(int item) {
        mPreferencesHelper.setCurrentItem(item);
    }

    @Override
    public boolean getAutoCacheState() {
        return mPreferencesHelper.getAutoCacheState();
    }

    @Override
    public void setAutoCacheState(boolean state) {
        mPreferencesHelper.setAutoCacheState(state);
    }

    @Override
    public boolean getNoImageState() {
        return mPreferencesHelper.getNoImageState();
    }

    @Override
    public void setNoImageState(boolean state) {
        mPreferencesHelper.setNoImageState(state);
    }

    @Override
    public boolean getNightModeState() {
        return mPreferencesHelper.getNightModeState();
    }

    @Override
    public void setNightModeState(boolean state) {
        mPreferencesHelper.setNightModeState(state);
    }
}
