package com.baserecyclerviewadapter;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.baserecyclerviewadapter.adapter.MultipleItemAdapter;
import com.baserecyclerviewadapter.base.BaseActivity;
import com.baserecyclerviewadapter.data.DataServer;

/**
 * 多类型的item
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class MultipleItemActivity extends BaseActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_multiple_type);
        super.setTitle("ChatMessage");
        super.setBackBtn();

        this.mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        MultipleItemAdapter multipleItemAdapter = new MultipleItemAdapter(DataServer.getMultipleItemData());
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        this.mRecyclerView.setLayoutManager(manager);
        this.mRecyclerView.setAdapter(multipleItemAdapter);
    }
}
