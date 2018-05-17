package com.hansen.mvpframe.ui.main.fragment;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatCheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hansen.mvpframe.R;
import com.hansen.mvpframe.app.Constants;
import com.hansen.mvpframe.base.BaseFragment;
import com.hansen.mvpframe.component.ACache;
import com.hansen.mvpframe.base.presenter.main.SettingPresenter;
import com.hansen.mvpframe.base.contract.main.SettingContract;
import com.hansen.mvpframe.util.ShareUtil;

import java.io.File;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by codeest on 16/8/23.
 */

public class SettingFragment extends BaseFragment<SettingPresenter> implements CompoundButton.OnCheckedChangeListener, SettingContract.View{

    @BindView(R.id.cb_setting_cache)
    AppCompatCheckBox cbSettingCache;
    @BindView(R.id.cb_setting_image)
    AppCompatCheckBox cbSettingImage;
    @BindView(R.id.cb_setting_night)
    AppCompatCheckBox cbSettingNight;
    @BindView(R.id.ll_setting_feedback)
    LinearLayout llSettingFeedback;
    @BindView(R.id.tv_setting_clear)
    TextView tvSettingClear;
    @BindView(R.id.ll_setting_clear)
    LinearLayout llSettingClear;
    @BindView(R.id.tv_setting_update)
    TextView tvSettingUpdate;
    @BindView(R.id.ll_setting_update)
    LinearLayout llSettingUpdate;

    private File cacheFile;
    private String versionName;
    private boolean isNull = true;

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_setting;
    }

    @Override
    protected void initEventAndData() {
        cacheFile = new File(Constants.PATH_CACHE);
        tvSettingClear.setText(ACache.getCacheSize(cacheFile));
//        cbSettingCache.setChecked(mPresenter.getAutoCacheState());
//        cbSettingImage.setChecked(mPresenter.getNoImageState());
//        cbSettingNight.setChecked(mPresenter.getNightModeState());
        cbSettingCache.setOnCheckedChangeListener(this);
        cbSettingImage.setOnCheckedChangeListener(this);
        cbSettingNight.setOnCheckedChangeListener(this);
        try {
            PackageManager pm = getActivity().getPackageManager();
            PackageInfo pi = pm.getPackageInfo(getActivity().getPackageName(), PackageManager.GET_ACTIVITIES);
            versionName = pi.versionName;
            tvSettingUpdate.setText(String.format("当前版本号 v%s",versionName));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        isNull = savedInstanceState == null;
        super.onCreate(savedInstanceState);
    }

    @OnClick(R.id.ll_setting_feedback)
    void doFeedBack() {
        ShareUtil.sendEmail(mContext, "选择邮件客户端:");
    }

    @OnClick(R.id.ll_setting_clear)
    void doClear() {
        ACache.deleteDir(cacheFile);
        tvSettingClear.setText(ACache.getCacheSize(cacheFile));
    }

    @OnClick(R.id.ll_setting_update)
    void doUpdate() {
//        mPresenter.checkVersion(versionName);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()) {
            case R.id.cb_setting_night:
                if (isNull) {   //防止夜间模式MainActivity执行reCreate后重复调用
//                    mPresenter.setNightModeState(b);
//                    NightModeEvent event = new NightModeEvent();
//                    event.setNightMode(b);
//                    RxBus.getDefault().post(event);
                }
                break;
            case R.id.cb_setting_image:
//                mPresenter.setNoImageState(b);
                break;
            case R.id.cb_setting_cache:
//                mPresenter.setAutoCacheState(b);
                break;
        }
    }


}
