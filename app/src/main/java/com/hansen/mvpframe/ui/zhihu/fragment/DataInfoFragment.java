package com.hansen.mvpframe.ui.zhihu.fragment;

import com.hansen.mvpframe.R;
import com.hansen.mvpframe.base.BaseFragment;
import com.hansen.mvpframe.base.RootFragment;
import com.hansen.mvpframe.base.contract.zhihu.DataInfoContract;
import com.hansen.mvpframe.base.contract.zhihu.NewInfoContract;
import com.hansen.mvpframe.base.presenter.zhihu.DataInfoPresenter;
import com.hansen.mvpframe.base.presenter.zhihu.NewInfoPresenter;

/**
 * 创建者 by ${HanSir} on 2018/5/17.
 * 版权所有  WELLTRANS.
 * 说明      日报
 */

public class DataInfoFragment extends RootFragment<DataInfoPresenter> implements DataInfoContract.View{

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_data;
    }


}
