package com.baserecyclerviewadapter.entity;

import com.recyclerview.library.entity.MultiItemEntity;

/**
 * @author PengZhenjin
 * @date 2016-12-28
 */
public class ClickEntity implements MultiItemEntity {
    public static final int CLICK_ITEM_VIEW            = 1;
    public static final int CLICK_ITEM_CHILD_VIEW      = 2;
    public static final int LONG_CLICK_ITEM_VIEW       = 3;
    public static final int LONG_CLICK_ITEM_CHILD_VIEW = 4;
    public int Type;

    public ClickEntity(final int type) {
        Type = type;
    }

    @Override
    public int getItemType() {
        return Type;
    }
}
