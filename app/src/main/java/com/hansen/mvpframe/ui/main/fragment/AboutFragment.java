package com.hansen.mvpframe.ui.main.fragment;

import com.hansen.mvpframe.R;
import com.hansen.mvpframe.app.Constants;
import com.hansen.mvpframe.base.SimpleFragment;
import com.hansen.mvpframe.util.AlipayUtil;
import com.hansen.mvpframe.util.SnackbarUtil;

import butterknife.OnClick;

/**
 * Created by codeest on 16/8/23.
 */

public class AboutFragment extends SimpleFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_about;
    }

    @Override
    protected void initEventAndData() {
    }

    @OnClick(R.id.cv_about_award)
    void awardAuthor() {
        if (AlipayUtil.hasInstalledAlipayClient(mContext)) {
//            AlipayUtil.startAlipayClient(getActivity(), Constants.KEY_ALIPAY);
        } else {
            SnackbarUtil.showShort(getActivity().getWindow().getDecorView(), "木有检测到支付宝客户端 T T");
        }
    }

}
