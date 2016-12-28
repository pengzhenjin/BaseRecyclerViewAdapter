package com.baserecyclerviewadapter.adapter;

import com.baserecyclerviewadapter.R;
import com.baserecyclerviewadapter.data.DataServer;
import com.baserecyclerviewadapter.entity.Status;
import com.recyclerview.library.BaseRecyclerViewAdapter;
import com.recyclerview.library.BaseRecyclerViewHolder;

/**
 * HeaderAndFooterAdapter
 *
 * @author PengZhenjin
 * @date 2016-12-28
 */
public class HeaderAndFooterAdapter extends BaseRecyclerViewAdapter<Status, BaseRecyclerViewHolder> {
    public HeaderAndFooterAdapter() {
        super(R.layout.item_header_and_footer_list, DataServer.getSampleData(100));
    }

    public HeaderAndFooterAdapter(int dataSize) {
        super(R.layout.item_header_and_footer_list, DataServer.getSampleData(dataSize));
    }

    @Override
    protected void convert(BaseRecyclerViewHolder viewHolder, Status data) {

    }
}
