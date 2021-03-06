package com.lairui.template.uiview.fragment;

import android.view.View;

import com.lairui.template.R;
import com.lairui.template.presenter.FirstMainPresenter;
import com.wanou.framelibrary.base.BaseMvpFragment;

/**
 * Author by wodx521
 * Date on 2018/12/4.
 */
public class FirstMainFragment extends BaseMvpFragment<FirstMainPresenter> {
    @Override
    protected FirstMainPresenter getPresenter() {
        return new FirstMainPresenter();
    }

    @Override
    protected int getResId() {
        return R.layout.fragment_first_main;
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
