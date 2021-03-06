package com.baserecyclerviewadapter.entity;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class MainItem {
    private String   title;
    private Class<?> activity;
    private int      imageResource;

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Class<?> getActivity() {
        return activity;
    }

    public void setActivity(Class<?> activity) {
        this.activity = activity;
    }
}