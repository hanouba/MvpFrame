package com.hansen.mvpframe.ui.main.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.TableLayout;

import com.hansen.mvpframe.R;
import com.hansen.mvpframe.base.BaseFragment;
import com.hansen.mvpframe.base.SimpleFragment;

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

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_zhihu_main;
    }

    @Override
    protected void initEventAndData() {

    }


}
