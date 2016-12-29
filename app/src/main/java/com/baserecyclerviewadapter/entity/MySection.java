package com.baserecyclerviewadapter.entity;

import com.recyclerview.library.entity.SectionEntity;

/**
 * @author PengZhenjin
 * @date 2016-12-28
 */
public class MySection extends SectionEntity<Video> {

    public MySection(boolean isHeader, String headerName) {
        super(isHeader, headerName);
    }

    public MySection(Video t) {
        super(t);
    }
}
