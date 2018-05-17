package com.hansen.mvpframe.di.module;

import com.hansen.mvpframe.app.App;
import com.hansen.mvpframe.model.DataManager;
import com.hansen.mvpframe.model.db.DBHelper;
import com.hansen.mvpframe.model.db.RealmHelper;
import com.hansen.mvpframe.model.http.HttpHelper;
import com.hansen.mvpframe.model.http.RetrofitHelper;
import com.hansen.mvpframe.model.prefs.ImplPreferencesHelper;
import com.hansen.mvpframe.model.prefs.PreferencesHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by codeest on 16/8/7.
 */

@Module
public class AppModule {
    private final App application;

    public AppModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    App provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
        return retrofitHelper;
    }

    @Provides
    @Singleton
    DBHelper provideDBHelper(RealmHelper realmHelper) {
        return realmHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(ImplPreferencesHelper implPreferencesHelper) {
        return implPreferencesHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(HttpHelper httpHelper, DBHelper DBHelper, PreferencesHelper preferencesHelper) {
        return new DataManager(httpHelper, DBHelper, preferencesHelper);
    }
}
