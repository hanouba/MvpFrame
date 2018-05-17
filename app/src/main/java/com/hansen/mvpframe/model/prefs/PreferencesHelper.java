package com.hansen.mvpframe.model.prefs;

/**
 获取各种状态
 存储各种状态
 */


public interface PreferencesHelper {

    //==========用来保存界面状态 从而显示上次打开的界面
    //获取首页当前界面索引
    int getCurrentItem();
    //设置当前界面 的索引
    void setCurrentItem(int item);
}
