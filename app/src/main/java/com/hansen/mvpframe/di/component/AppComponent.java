package com.hansen.mvpframe.di.component;

import com.hansen.mvpframe.app.App;
import com.hansen.mvpframe.di.module.AppModule;
import com.hansen.mvpframe.di.module.HttpModule;
import com.hansen.mvpframe.model.DataManager;
import com.hansen.mvpframe.model.db.RealmHelper;
import com.hansen.mvpframe.model.http.RetrofitHelper;
import com.hansen.mvpframe.model.prefs.ImplPreferencesHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    App getContext();  // 提供App的Context

    DataManager getDataManager(); //数据中心

    RetrofitHelper retrofitHelper();  //提供http的帮助类

    RealmHelper realmHelper();    //提供数据库帮助类

    ImplPreferencesHelper preferencesHelper(); //提供sp帮助类
}
