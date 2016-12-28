package com.baserecyclerviewadapter;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.baserecyclerviewadapter.adapter.HeaderAndFooterAdapter;
import com.baserecyclerviewadapter.base.BaseActivity;
import com.recyclerview.library.BaseRecyclerViewHolder;
import com.recyclerview.library.listener.SimpleClickListener;

/**
 * 头部和尾部
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class HeaderAndFooterActivity extends BaseActivity {

    private RecyclerView           mRecyclerView;
    private HeaderAndFooterAdapter mAdapter;
    private static final int PAGE_SIZE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setBackBtn();
        super.setTitle("HeaderAndFooter");
        //        Window window = this.getWindow();
        //取消设置透明状态栏,使 ContentView 内容不再覆盖状态栏
        //        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        //需要设置这个 flag 才能调用 setStatusBarColor 来设置状态栏颜色
        //        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        //        //设置状态栏颜色
        //        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        //            window.setStatusBarColor(Color.TRANSPARENT);
        //        }
        super.setContentView(R.layout.activity_header_and_footer);
        this.mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.initAdapter();

        View headerView = this.getHeaderView(this.getRemoveHeaderListener(), "click me to remove me");
        this.mAdapter.addHeaderView(headerView);

        View footerView = this.getFooterView(this.getRemoveFooterListener(), "click me to remove me");
        this.mAdapter.addFooterView(footerView);

        //this.mRecyclerView.setAdapter(this.mAdapter);
    }

    private View getHeaderView(View.OnClickListener listener, String text) {
        View view = getLayoutInflater().inflate(R.layout.head_view, (ViewGroup) this.mRecyclerView.getParent(), false);
        view.setOnClickListener(listener);
        return view;
    }

    private View getFooterView(View.OnClickListener listener, String text) {
        View view = getLayoutInflater().inflate(R.layout.footer_view, (ViewGroup) this.mRecyclerView.getParent(), false);
        view.setOnClickListener(listener);
        return view;
    }

    private View.OnClickListener getRemoveHeaderListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdapter.removeHeaderView(v);
            }
        };
    }

    private View.OnClickListener getRemoveFooterListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdapter.removeFooterView(v);
            }
        };
    }

    private void initAdapter() {
        this.mAdapter = new HeaderAndFooterAdapter(PAGE_SIZE);
        this.mRecyclerView.setAdapter(this.mAdapter);
        this.mAdapter.setOnItemClickListener(new SimpleClickListener() {
            @Override
            public void onItemClick(View view, BaseRecyclerViewHolder viewHolder, int position) {
                Toast.makeText(HeaderAndFooterActivity.this, "" + Integer.toString(position), Toast.LENGTH_LONG).show();
            }
        });
    }
}
