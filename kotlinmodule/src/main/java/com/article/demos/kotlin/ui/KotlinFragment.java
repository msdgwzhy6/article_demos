package com.article.demos.kotlin.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.article.demos.common.base.BaseFragment;
import com.article.demos.common.constant.Constant;
import com.article.demos.kotlin.R;

/**
 * A simple {@link Fragment} subclass.
 * @author lxy
 */
@Route(path = Constant.KOTLIN_PAHT)
public class KotlinFragment extends BaseFragment {


    public KotlinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kotlin, container, false);
    }

}
