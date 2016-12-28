package com.recyclerview.library.listener;

import android.view.View;
import com.recyclerview.library.BaseRecyclerViewAdapter;
import com.recyclerview.library.BaseRecyclerViewHolder;

/**
 * 简单的点击事件
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class SimpleClickListener implements BaseRecyclerViewAdapter.OnItemClickListener {

    @Override
    public void onItemClick(View view, BaseRecyclerViewHolder viewHolder, int position) {

    }

    @Override
    public boolean onItemLongClick(View view, BaseRecyclerViewHolder viewHolder, int position) {
        return false;
    }
}


