package com.lairui.radarplanet.uiview.fragment;

import android.view.View;

import com.lairui.radarplanet.R;
import com.lairui.radarplanet.presenter.FourMainPresenter;
import com.wanou.framelibrary.base.BaseMvpFragment;

/**
 * Author by wodx521
 * Date on 2018/12/4.
 */
public class FourMainFragment extends BaseMvpFragment<FourMainPresenter> {
    @Override
    protected FourMainPresenter getPresenter() {
        return new FourMainPresenter();
    }

    @Override
    protected int getResId() {
        return R.layout.fragment_four_main;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void isHiddenListener(boolean hidden) {

    }
}
