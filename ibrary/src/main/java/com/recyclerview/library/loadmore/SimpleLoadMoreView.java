package com.recyclerview.library.loadmore;

import com.recyclerview.library.R;

/**
 * 简单的加载更多view
 *
 * @author PengZhenjin
 * @date 2016-12-26
 */
public class SimpleLoadMoreView extends LoadMoreView {

    @Override
    public int getLayoutId() {
        return R.layout.load_more;
    }

    @Override
    protected int getLoadingViewId() {
        return R.id.load_more_loading_view;
    }

    @Override
    protected int getLoadFailedViewId() {
        return R.id.load_more_load_failed_view;
    }

    @Override
    protected int getLoadEndViewId() {
        return R.id.load_more_load_end_view;
    }
}
