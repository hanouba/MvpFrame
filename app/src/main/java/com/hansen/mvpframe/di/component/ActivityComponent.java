package com.hansen.mvpframe.di.component;

import android.app.Activity;

import com.hansen.mvpframe.di.scope.ActivityScope;
import com.hansen.mvpframe.di.module.ActivityModule;
import com.hansen.mvpframe.ui.main.activity.MainActivity;
import com.hansen.mvpframe.ui.main.activity.WelcomeActivity;


import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

    void inject(WelcomeActivity welcomeActivity);

    void inject(MainActivity mainActivity);

}
