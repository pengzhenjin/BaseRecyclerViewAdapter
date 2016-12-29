package com.baserecyclerviewadapter.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import com.baserecyclerviewadapter.R;
import com.baserecyclerviewadapter.entity.MySection;
import com.baserecyclerviewadapter.entity.Video;
import com.recyclerview.library.BaseRecyclerViewHolder;
import com.recyclerview.library.BaseSectionAdapter;
import java.util.List;

/**
 * SectionAdapter
 *
 * @author PengZhenjin
 * @date 2016-12-29
 */
public class SectionAdapter extends BaseSectionAdapter<MySection, BaseRecyclerViewHolder> {

    public SectionAdapter(int layoutResId, int sectionHeadResId, List<MySection> data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseRecyclerViewHolder viewHolder, final MySection item) {
        TextView headerTv = viewHolder.getView(R.id.header_tv);
        headerTv.setText(item.sectionName);
    }

    @Override
    protected void convert(BaseRecyclerViewHolder viewHolder, MySection item) {
        Video video = item.data;
        ImageView imageView = viewHolder.getView(R.id.iv);
        TextView textView = viewHolder.getView(R.id.tv);
        textView.setText(video.getName());
    }
}
