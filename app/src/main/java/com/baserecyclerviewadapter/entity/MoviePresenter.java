package com.baserecyclerviewadapter.entity;

import android.view.View;
import android.widget.Toast;

/**
 * @author PengZhenjin
 * @date 2016-12-28
 */
public class MoviePresenter {
    public void buyTicket(View view, Movie movie) {
        Toast.makeText(view.getContext(), "buy ticket: " + movie.name, Toast.LENGTH_SHORT).show();
    }
}
