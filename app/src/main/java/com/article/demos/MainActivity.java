package com.article.demos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.article.demos.android.ui.AndroidFragment;
import com.article.demos.common.base.BaseActivity;
import com.article.demos.common.constant.Constant;
import com.article.demos.java.ui.JavaFragment;
import com.article.demos.kotlin.ui.KotlinFragment;
import com.article.demos.vue.ui.VueFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author a
 */
public class MainActivity extends BaseActivity {

    private List<Fragment> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

    }

    private void initData() {
        mList = new ArrayList<>();
        JavaFragment java = (JavaFragment) ARouter.getInstance().build(Constant.JAVA_PAHT).navigation();
        AndroidFragment android = (AndroidFragment) ARouter.getInstance().build(Constant.ANDROID_PAHT).navigation();
        KotlinFragment kotlin = (KotlinFragment) ARouter.getInstance().build(Constant.KOTLIN_PAHT).navigation();
        VueFragment vue = (VueFragment) ARouter.getInstance().build(Constant.VUE_PAHT).navigation();

        mList.add(java);
        mList.add(android);
        mList.add(kotlin);
        mList.add(vue);
    }

}
