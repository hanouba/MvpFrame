package com.hansen.mvpframe.ui.zhihu.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hansen.mvpframe.R;
import com.hansen.mvpframe.base.BaseFragment;
import com.hansen.mvpframe.base.RootFragment;
import com.hansen.mvpframe.base.contract.zhihu.NewInfoContract;
import com.hansen.mvpframe.base.presenter.zhihu.NewInfoPresenter;
import com.hansen.mvpframe.model.bean.NewInfoBean;
import com.hansen.mvpframe.ui.zhihu.adapter.NewInfoAdapter;

import java.util.List;

import butterknife.BindView;

/**
 * 创建者 by ${HanSir} on 2018/5/17.
 * 版权所有  WELLTRANS.
 * 说明      最新消息
 */

public class NewInfoFragment extends RootFragment<NewInfoPresenter> implements NewInfoContract.View{
    @BindView(R.id.swipe_layout)
    SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.view_main)
    RecyclerView mRecyclerView;

    private NewInfoAdapter newInfoAdapter;

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initEventAndData() {
        super.initEventAndData();
        mPresenter.getNewInfo();
//        stateLoading();
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mPresenter.getNewInfo();
            }
        });


    }

    @Override
    public void showNewInfo(List<NewInfoBean.TopStoriesBean> topList) {
        if(mSwipeRefreshLayout.isRefreshing()) {
            mSwipeRefreshLayout.setRefreshing(false);
        }
        newInfoAdapter = new NewInfoAdapter(topList,getContext());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setAdapter(newInfoAdapter);

    }
}
