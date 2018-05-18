package com.hansen.mvpframe.ui.main.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TableLayout;

import com.hansen.mvpframe.R;
import com.hansen.mvpframe.base.BaseFragment;
import com.hansen.mvpframe.base.SimpleFragment;
import com.hansen.mvpframe.ui.main.adapter.ZhiHuAdapter;
import com.hansen.mvpframe.ui.zhihu.fragment.DataInfoFragment;
import com.hansen.mvpframe.ui.zhihu.fragment.NewInfoFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 创建者 by ${HanSir} on 2018/5/17.
 * 版权所有  WELLTRANS.
 * 说明      知乎日报
 */

public class ZhiHuFragment extends SimpleFragment{
    @BindView(R.id.tab_zhihu_main)
    TabLayout mTableLayout;
    @BindView(R.id.vp_zhihu_main)
    ViewPager zhihuView;

    //标题 数组
    String[] taps = new String[]{"最新","日报"};
    //fragment
    List<Fragment> fragments = new ArrayList<>();
    //存储fragment 的adapter
    ZhiHuAdapter mZhiHuAdapter;

    //用到的fragments
    NewInfoFragment newInfoFragment ;
    DataInfoFragment dataInfoFragment;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_zhihu_main;
    }

    @Override
    protected void initEventAndData() {
        //
        newInfoFragment = new NewInfoFragment();
        dataInfoFragment = new DataInfoFragment();
        fragments.add(newInfoFragment);
        fragments.add(dataInfoFragment);
        mZhiHuAdapter = new ZhiHuAdapter(getChildFragmentManager(),fragments);

        //打气筒
        zhihuView.setAdapter(mZhiHuAdapter);
        //标题
        mTableLayout.addTab(mTableLayout.newTab().setText(taps[0]));
        mTableLayout.addTab(mTableLayout.newTab().setText(taps[1]));
        mTableLayout.setupWithViewPager(zhihuView);
        mTableLayout.getTabAt(0).setText(taps[0]);
        mTableLayout.getTabAt(1).setText(taps[1]);


    }


}
