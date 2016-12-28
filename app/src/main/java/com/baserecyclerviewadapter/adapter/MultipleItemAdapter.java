package com.baserecyclerviewadapter.adapter;

import android.widget.ImageView;
import android.widget.TextView;
import com.baserecyclerviewadapter.R;
import com.baserecyclerviewadapter.entity.ChatMessage;
import com.recyclerview.library.BaseMultiItemAdapter;
import com.recyclerview.library.BaseRecyclerViewHolder;
import java.util.List;

/**
 * MultipleItemAdapter
 *
 * @author PengZhenjin
 * @date 2016-12-28
 */
public class MultipleItemAdapter extends BaseMultiItemAdapter<ChatMessage, BaseRecyclerViewHolder> {

    public MultipleItemAdapter(List<ChatMessage> data) {
        super(data);
        super.addItemType(ChatMessage.MESSAGE_TYPE_SENT_TXT, R.layout.item_send_text_message);
        super.addItemType(ChatMessage.MESSAGE_TYPE_RECEIVE_TXT, R.layout.item_receive_text_message);
    }

    @Override
    protected void convert(BaseRecyclerViewHolder viewHolder, ChatMessage data) {
        switch (viewHolder.getItemViewType()) {
            case ChatMessage.MESSAGE_TYPE_SENT_TXT: {
                ImageView headIv = viewHolder.getView(R.id.head_iv);
                TextView contentTv = viewHolder.getView(R.id.content_tv);
                headIv.setImageResource(R.mipmap.head_send);
                contentTv.setText(data.getContent());
                break;
            }
            case ChatMessage.MESSAGE_TYPE_RECEIVE_TXT: {
                ImageView headIv = viewHolder.getView(R.id.head_iv);
                TextView contentTv = viewHolder.getView(R.id.content_tv);
                headIv.setImageResource(R.mipmap.head_receive);
                contentTv.setText(data.getContent());
                break;
            }
        }
    }
}
