package com.article.demos.common.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;

/**
 * @author a
 */
public class BaseFragment extends Fragment{

    public String TAG = "BaseFragment";
    /**
     * 标识fragment视图已经初始化完毕
     */
    private boolean mIsViewPrepared;

    /**
     * 标识已经触发过懒加载数据
     */
    private boolean mHasFetchData;

    /**  懒加载的方式获取数据，仅在满足fragment可见和视图已经准备好的时候调用一次 */
    protected void lazyFetchData() {
        Log.v(TAG, getClass().getName() + "------>lazyFetchData");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mIsViewPrepared = true;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mHasFetchData = false;
        mIsViewPrepared = false;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            lazyFetchDataIfPrepared();
        }
    }

    private void lazyFetchDataIfPrepared() {
        // 用户可见fragment && 没有加载过数据 && 视图已经准备完毕
        if (getUserVisibleHint() && !mHasFetchData && mIsViewPrepared) {
            mHasFetchData = true; //已加载过数据
            lazyFetchData();
        }
    }

}
