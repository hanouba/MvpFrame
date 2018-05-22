package com.hansen.mvpframe.model.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.hansen.mvpframe.app.App;
import com.hansen.mvpframe.app.Constants;

import javax.inject.Inject;

/**
 yong sp 来 获取存储一些设置状态
 */

public class ImplPreferencesHelper implements PreferencesHelper {

    private static final boolean DEFAULT_NIGHT_MODE = false;
    private static final boolean DEFAULT_NO_IMAGE = false;
    private static final boolean DEFAULT_AUTO_SAVE = true;

    private static final boolean DEFAULT_LIKE_POINT = false;
    private static final boolean DEFAULT_VERSION_POINT = false;
    private static final boolean DEFAULT_MANAGER_POINT = false;

    private static final int DEFAULT_CURRENT_ITEM = Constants.TYPE_ZHIHU;

    private static final String SHAREDPREFERENCES_NAME = "my_sp";

    private final SharedPreferences mSPrefs;

    @Inject
    public ImplPreferencesHelper() {
        mSPrefs = App.getInstance().getSharedPreferences(SHAREDPREFERENCES_NAME, Context.MODE_PRIVATE);
    }


    @Override
    public int getCurrentItem() {
        return mSPrefs.getInt(Constants.SP_CURRENT_ITEM,DEFAULT_CURRENT_ITEM);
    }

    @Override
    public void setCurrentItem(int item) {
        mSPrefs.edit().putInt(Constants.SP_CURRENT_ITEM,item).apply();
    }

    //是否自动缓存
    @Override
    public boolean getAutoCacheState() {
        return mSPrefs.getBoolean(Constants.SP_AUTO_CACHE,DEFAULT_AUTO_SAVE);
    }

    @Override
    public void setAutoCacheState(boolean state) {
        mSPrefs.edit().putBoolean(Constants.SP_AUTO_CACHE,state).apply();
    }

    @Override
    public boolean getNoImageState() {
        return mSPrefs.getBoolean(Constants.SP_NO_IMAGE,DEFAULT_NO_IMAGE);
    }

    @Override
    public void setNoImageState(boolean state) {
        mSPrefs.edit().putBoolean(Constants.SP_NO_IMAGE,state).apply();
    }

    @Override
    public boolean getNightModeState() {
        return mSPrefs.getBoolean(Constants.SP_NIGHT_MODE,DEFAULT_NIGHT_MODE);
    }

    @Override
    public void setNightModeState(boolean state) {
        mSPrefs.edit().putBoolean(Constants.SP_NIGHT_MODE,state).apply();
    }
}
