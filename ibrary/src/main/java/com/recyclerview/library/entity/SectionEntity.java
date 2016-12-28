package com.recyclerview.library.entity;

/**
 * 分组item基类
 *
 * @author PengZhenjin
 * @date 2016-12-28
 */
public abstract class SectionEntity<T> {
    protected boolean isHeader;
    protected T       t;
    protected String  header;

    public SectionEntity(boolean isHeader, String header) {
        this.isHeader = isHeader;
        this.header = header;
        this.t = null;
    }

    public SectionEntity(T t) {
        this.isHeader = false;
        this.header = null;
        this.t = t;
    }
}
