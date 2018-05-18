package com.hansen.mvpframe.di.component;

import android.app.Activity;

import com.hansen.mvpframe.base.contract.zhihu.NewInfoContract;
import com.hansen.mvpframe.di.scope.FragmentScope;
import com.hansen.mvpframe.di.module.FragmentModule;
import com.hansen.mvpframe.ui.gank.fragment.TechFragment;

import com.hansen.mvpframe.ui.main.fragment.SettingFragment;
import com.hansen.mvpframe.ui.main.fragment.ZhiHuFragment;
import com.hansen.mvpframe.ui.zhihu.fragment.DataInfoFragment;
import com.hansen.mvpframe.ui.zhihu.fragment.NewInfoFragment;


import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();
    void inject(TechFragment techFragment);
    void inject(SettingFragment settingFragment);
    void inject(ZhiHuFragment zhiHuFragment);
    void inject(NewInfoFragment newInfoFragment);
    void inject(DataInfoFragment dataInfoFragment);




}
