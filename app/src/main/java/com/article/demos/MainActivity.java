package com.article.demos;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.article.demos.common.base.BaseActivity;
import com.article.demos.common.constant.Constant;
import com.article.demos.java.ui.JavaFragment;

/**
 * @author a
 */
public class MainActivity extends BaseActivity {


    private JavaFragment mJavaFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJavaFragment = (JavaFragment) ARouter.getInstance().build(Constant.JAVA_PAHT).navigation();

    }

    public void bt(View view) {
        Toast.makeText(view.getContext(), mJavaFragment.getClass().getSimpleName(), Toast.LENGTH_SHORT).show();
    }
}
