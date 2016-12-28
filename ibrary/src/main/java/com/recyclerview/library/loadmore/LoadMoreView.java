package com.recyclerview.library.loadmore;

import com.recyclerview.library.BaseRecyclerViewHolder;

/**
 * 加载更多view
 *
 * @author PengZhenjin
 * @date 2016-12-26
 */
public abstract class LoadMoreView {

    /**
     * 状态-默认
     */
    public static final int STATUS_DEFAULT = 1;

    /**
     * 状态-正在加载
     */
    public static final int STATUS_LOADING = 2;

    /**
     * 状态-加载失败
     */
    public static final int STATUS_FAILED = 3;

    /**
     * 状态-加载结束
     */
    public static final int STATUS_END = 4;

    /**
     * 默认状态
     */
    private int mLoadMoreStatus = STATUS_DEFAULT;

    /**
     * 是否隐藏加载更多view
     */
    private boolean mIsLoadMoreHide = false;

    /**
     * 设置加载更多的状态
     *
     * @param loadMoreStatus
     */
    public void setLoadMoreStatus(int loadMoreStatus) {
        this.mLoadMoreStatus = loadMoreStatus;
    }

    /**
     * 获取加载更多的状态
     *
     * @return
     */
    public int getLoadMoreStatus() {
        return this.mLoadMoreStatus;
    }

    /**
     * 转换
     *
     * @param holder
     */
    public void convert(BaseRecyclerViewHolder holder) {
        switch (this.mLoadMoreStatus) {
            case STATUS_LOADING:
                this.visibleLoading(holder, true);
                this.visibleLoadFailed(holder, false);
                this.visibleLoadEnd(holder, false);
                break;
            case STATUS_FAILED:
                this.visibleLoading(holder, false);
                this.visibleLoadFailed(holder, true);
                this.visibleLoadEnd(holder, false);
                break;
            case STATUS_END:
                this.visibleLoading(holder, false);
                this.visibleLoadFailed(holder, false);
                this.visibleLoadEnd(holder, true);
                break;
        }
    }

    private void visibleLoading(BaseRecyclerViewHolder holder, boolean isVisible) {
        holder.setVisible(this.getLoadingViewId(), isVisible);
    }

    private void visibleLoadFailed(BaseRecyclerViewHolder holder, boolean isVisible) {
        holder.setVisible(this.getLoadFailedViewId(), isVisible);
    }

    private void visibleLoadEnd(BaseRecyclerViewHolder holder, boolean isVisible) {
        final int loadEndViewId = this.getLoadEndViewId();
        if (loadEndViewId != 0) {
            holder.setVisible(loadEndViewId, isVisible);
        }
    }

    /**
     * 设置是否隐藏加载更多的view
     *
     * @param isHide
     */
    public final void setLoadMoreHide(boolean isHide) {
        this.mIsLoadMoreHide = isHide;
    }

    /**
     * 加载更多是否已隐藏
     *
     * @return
     */
    public final boolean isLoadMoreHide() {
        if (this.getLoadEndViewId() == 0) {
            return true;
        }
        return this.mIsLoadMoreHide;
    }

    /**
     * 获取加载更多的布局文件id
     *
     * @return
     */
    public abstract int getLayoutId();

    /**
     * 获取正在加载的viewId
     *
     * @return
     */
    protected abstract int getLoadingViewId();

    /**
     * 获取加载失败的view
     *
     * @return
     */
    protected abstract int getLoadFailedViewId();

    /**
     * 获取加载结束后的viewId，允许return 0
     *
     * @return
     */
    protected abstract int getLoadEndViewId();
}
