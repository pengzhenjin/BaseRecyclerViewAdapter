package com.baserecyclerviewadapter.entity;

import com.recyclerview.library.entity.SectionEntity;

/**
 * @author PengZhenjin
 * @date 2016-12-28
 */
public class MySection extends SectionEntity<Video> {
    private boolean isMore;

    public MySection(boolean isHeader, String header, boolean isMroe) {
        super(isHeader, header);
        this.isMore = isMroe;
    }

    public MySection(Video t) {
        super(t);
    }

    public boolean isMore() {
        return isMore;
    }

    public void setMore(boolean mroe) {
        isMore = mroe;
    }
}
