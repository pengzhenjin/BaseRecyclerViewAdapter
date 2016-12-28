package com.baserecyclerviewadapter.entity;

/**
 * @author PengZhenjin
 * @date 2016-12-28
 */
public class Movie {

    public String name;
    public int    length;
    public int    price;

    public Movie(String name, int length, int price) {
        this.length = length;
        this.name = name;
        this.price = price;
    }
}
