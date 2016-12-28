package com.baserecyclerviewadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import com.baserecyclerviewadapter.adapter.MainAdapter;
import com.baserecyclerviewadapter.entity.MainItem;
import com.recyclerview.library.BaseRecyclerViewAdapter;
import com.recyclerview.library.BaseRecyclerViewHolder;
import com.recyclerview.library.listener.SimpleClickListener;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final Class<?>[] ACTIVITY = { AnimationActivity.class, MultipleItemActivity.class, HeaderAndFooterActivity.class, PullToRefreshActivity.class, SectionActivity.class, EmptyViewActivity.class, ItemDragAndSwipeActivity.class, ItemClickActivity.class, ExpandableActivity.class, DataBindingActivity.class };
    private static final String[]   TITLE    = { "Animation", "MultipleItem", "HeaderAndFooter", "PullToRefresh", "Section", "EmptyView", "DragAndSwipe", "ItemClick", "ExpandableItem", "DataBinding" };
    private static final int[]      IMG      = { R.mipmap.gv_animation, R.mipmap.gv_multipleltem, R.mipmap.gv_header_and_footer, R.mipmap.gv_pulltorefresh, R.mipmap.gv_section, R.mipmap.gv_empty, R.mipmap.gv_drag_and_swipe, R.mipmap.gv_item_click, R.mipmap.gv_expandable, R.mipmap.gv_databinding, };

    private ArrayList<MainItem> mDataList;
    private RecyclerView        mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        this.initView();
        this.initData();
        this.initAdapter();
    }

    private void initView() {
        this.mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }

    private void initAdapter() {
        BaseRecyclerViewAdapter mainAdapter = new MainAdapter(R.layout.item_main_list, this.mDataList);
        View topView = getLayoutInflater().inflate(R.layout.top_view, null);
        mainAdapter.addHeaderView(topView);
        mainAdapter.setOnItemClickListener(new SimpleClickListener() {
            @Override
            public void onItemClick(View view, BaseRecyclerViewHolder viewHolder, int position) {
                //Intent intent = new Intent(MainActivity.this, ACTIVITY[position]);
                //startActivity(intent);
                Toast.makeText(MainActivity.this, "点击了" + position, Toast.LENGTH_SHORT).show();
            }
        });
        this.mRecyclerView.setAdapter(mainAdapter);
    }

    private void initData() {
        this.mDataList = new ArrayList<>();
        for (int i = 0; i < TITLE.length; i++) {
            MainItem item = new MainItem();
            item.setTitle(TITLE[i]);
            item.setActivity(ACTIVITY[i]);
            item.setImageResource(IMG[i]);
            this.mDataList.add(item);
        }
    }
}
