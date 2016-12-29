package com.recyclerview.library.entity;

/**
 * 分组item基类
 *
 * @author PengZhenjin
 * @date 2016-12-28
 */
public abstract class SectionEntity<T> {
    public boolean isSection;    // 是否需要分组
    public String  sectionName;  // 分组名称
    public T       data;    // 分组内容

    public SectionEntity(boolean isSection, String sectionName) {
        this.isSection = isSection;
        this.sectionName = sectionName;
        this.data = null;
    }

    public SectionEntity(T data) {
        this.isSection = false;
        this.sectionName = null;
        this.data = data;
    }
}
