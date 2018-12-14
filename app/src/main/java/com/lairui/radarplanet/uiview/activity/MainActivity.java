package com.lairui.radarplanet.uiview.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.lairui.radarplanet.R;
import com.lairui.radarplanet.fragmentfactory.MainFragmentFactory;
import com.lairui.radarplanet.presenter.MainPresenter;
import com.wanou.framelibrary.base.BaseMvpActivity;
import com.wanou.framelibrary.manager.ActivityManage;
import com.wanou.framelibrary.utils.UiTools;

import java.util.List;

/**
 * Author by wodx521
 * Date on 2018/12/4.
 */
public class MainActivity extends BaseMvpActivity<MainPresenter> {
    private AppBarLayout mAppBarLayout;
    private Toolbar mToolbar;
    private FrameLayout mFlContainer;
    private BottomNavigationView mNavigation;
    private FragmentTransaction fragmentTransaction;
    private double mTime = 0;

    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenter();
    }

    @Override
    protected int getResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mAppBarLayout = findViewById(R.id.appBarLayout);
        mToolbar = findViewById(R.id.toolbar);
        mFlContainer = findViewById(R.id.fl_container);
        mNavigation = findViewById(R.id.navigation);
        mAppBarLayout.setVisibility(View.GONE);
    }

    @Override
    protected void initData() {
        mNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                String title = menuItem.getTitle().toString();
                switch (itemId) {
                    case R.id.navigation_one:
                        addFragment(0, title);
                        break;
                    case R.id.navigation_two:
                        addFragment(1, title);
                        break;
                    case R.id.navigation_third:
                        addFragment(2, title);
                        break;
                    case R.id.navigation_four:
                        addFragment(3, title);
                        break;
                    case R.id.navigation_five:
                        addFragment(4, title);
                        break;
                    default:
                }
                return true;
            }
        });
        mNavigation.setSelectedItemId(R.id.navigation_one);
    }

    private void addFragment(int position, String title) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Fragment fragmentByTag = getSupportFragmentManager().findFragmentByTag(title);
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        for (Fragment fragment : fragments) {
            fragmentTransaction.hide(fragment);
        }
        if (fragmentByTag != null) {
            fragmentTransaction.show(fragmentByTag);
        } else {
            fragmentTransaction.add(R.id.fl_container, MainFragmentFactory.getFragment(position), title);
            fragmentTransaction.show(MainFragmentFactory.getFragment(position));
        }
        fragmentTransaction.commit();
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mTime) > 1000) {
                UiTools.showToast("再按一次退出程序");
                mTime = System.currentTimeMillis();
            } else {
                ActivityManage.getInstance().finishAll();
            }
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }
}
