package com.baserecyclerviewadapter.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import com.baserecyclerviewadapter.R;
import com.baserecyclerviewadapter.entity.MainItem;
import com.recyclerview.library.BaseRecyclerViewAdapter;
import com.recyclerview.library.BaseRecyclerViewHolder;
import java.util.List;

/**
 * MainAdapter
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class MainAdapter extends BaseRecyclerViewAdapter<MainItem, BaseRecyclerViewHolder> {

    public MainAdapter(int layoutResId, List<MainItem> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseRecyclerViewHolder viewHolder, MainItem data) {
        TextView textView = viewHolder.getView(R.id.text_tv);
        ImageView imageView = viewHolder.getView(R.id.icon_iv);

        textView.setText(data.getTitle());
        imageView.setImageResource(data.getImageResource());
    }
}
