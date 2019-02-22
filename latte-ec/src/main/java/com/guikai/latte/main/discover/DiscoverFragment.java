package com.guikai.latte.main.discover;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.guikai.latte.fragments.bottom.BottomItemFragment;
import com.guikai.latteec.R;

import static com.blankj.utilcode.util.BarUtils.getStatusBarHeight;

/**
 * Created by Anding on 2019/1/27 18:22
 * Note:
 */

public class DiscoverFragment extends BottomItemFragment {
    @Override
    public Object setLayout() {
        return R.layout.fragment_discover;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View root) {
        Toolbar mToolbar = $(R.id.tb_discover);
        mToolbar.setPadding(0, getStatusBarHeight(),0,0);
    }
}
