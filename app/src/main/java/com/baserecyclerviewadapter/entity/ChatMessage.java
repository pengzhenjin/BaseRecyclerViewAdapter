package com.baserecyclerviewadapter.entity;

import com.recyclerview.library.entity.MultiItemEntity;

/**
 * 注意：必须实现MultiItemEntity
 *
 * @author PengZhenjin
 * @date 2016-12-28
 */
public class ChatMessage implements MultiItemEntity {

    public static final int MESSAGE_TYPE_SENT_TXT    = 1;    // 发送文本
    public static final int MESSAGE_TYPE_RECEIVE_TXT = 2;    // 接收文本

    private int    itemType;
    private String content;

    public ChatMessage(int itemType, String content) {
        this.itemType = itemType;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
