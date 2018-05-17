package com.hansen.mvpframe.ui.zhihu.fragment;

import com.hansen.mvpframe.base.BaseFragment;
import com.hansen.mvpframe.base.contract.zhihu.NewInfoContract;
import com.hansen.mvpframe.base.presenter.zhihu.NewInfoPresenter;

/**
 * 创建者 by ${HanSir} on 2018/5/17.
 * 版权所有  WELLTRANS.
 * 说明      最新消息
 */

public class NewInfoFragment extends BaseFragment<NewInfoPresenter> implements NewInfoContract.View{

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }
    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void initEventAndData() {

    }


}
