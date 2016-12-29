package com.recyclerview.library;

import android.support.annotation.LayoutRes;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.recyclerview.library.entity.MultiItemEntity;
import java.util.List;

/**
 * 多类型的itemAdapter
 *
 * @author PengZhenjin
 * @date 2016-12-28
 */
public abstract class BaseMultiItemAdapter<T extends MultiItemEntity, VH extends BaseRecyclerViewHolder> extends BaseRecyclerViewAdapter<T, VH> {

    private SparseArray<Integer> mLayouts;

    public BaseMultiItemAdapter(List<T> dataList) {
        super(dataList);
    }

    @Override
    protected int getDefaultItemViewType(int position) {
        T item = super.mDataList.get(position);
        if (item != null) {
            return item.getItemType();
        }
        return super.getDefaultItemViewType(position);
    }

    @Override
    protected VH createDefaultViewHolder(ViewGroup parent, int viewType) {
        return super.createBaseViewHolder(parent, this.getLayoutId(viewType));
    }

    /**
     * 添加item类型
     *
     * @param viewType
     * @param layoutResId
     */
    protected void addItemType(int viewType, @LayoutRes int layoutResId) {
        if (this.mLayouts == null) {
            this.mLayouts = new SparseArray<>();
        }
        this.mLayouts.put(viewType, layoutResId);
    }

    /**
     * 获取布局id
     *
     * @param viewType
     *
     * @return
     */
    private int getLayoutId(int viewType) {
        return this.mLayouts.get(viewType);
    }
}
