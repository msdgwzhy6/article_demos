package com.article.demos.java.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.article.demos.common.base.BaseFragment;
import com.article.demos.common.constant.Constant;
import com.article.demos.java.R;


/**
 * @author a
 */
@Route(path = Constant.JAVA_PAHT)
public class JavaFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_java, container, false);
    }


}
