package com.lairui.template.uiview.fragment;

import android.view.View;

import com.lairui.template.R;
import com.lairui.template.presenter.SecondMainPresenter;
import com.wanou.framelibrary.base.BaseMvpFragment;

/**
 * Author by wodx521
 * Date on 2018/12/4.
 */
public class SecondMainFragment extends BaseMvpFragment<SecondMainPresenter> {
    @Override
    protected SecondMainPresenter getPresenter() {
        return new SecondMainPresenter();
    }

    @Override
    protected int getResId() {
        return R.layout.fragment_second_main;
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
