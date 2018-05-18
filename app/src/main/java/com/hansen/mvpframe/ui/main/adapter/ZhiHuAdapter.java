package com.hansen.mvpframe.ui.main.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.ViewGroup;

import com.hansen.mvpframe.base.contract.zhihu.NewInfoContract;

import java.util.List;

/**
 * 创建者 by ${HanSir} on 2018/5/18.
 * 版权所有  WELLTRANS.
 * 说明
 */

public class ZhiHuAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments;
    public ZhiHuAdapter(FragmentManager fm ,List<Fragment> fragments) {
        super(fm);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
