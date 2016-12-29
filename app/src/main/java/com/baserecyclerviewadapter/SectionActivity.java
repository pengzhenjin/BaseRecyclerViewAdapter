package com.baserecyclerviewadapter;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;
import com.baserecyclerviewadapter.adapter.SectionAdapter;
import com.baserecyclerviewadapter.base.BaseActivity;
import com.baserecyclerviewadapter.data.DataServer;
import com.baserecyclerviewadapter.entity.MySection;
import com.recyclerview.library.BaseRecyclerViewHolder;
import com.recyclerview.library.listener.SimpleClickListener;
import java.util.List;

/**
 * 分组
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class SectionActivity extends BaseActivity {
    private RecyclerView    mRecyclerView;
    private List<MySection> mDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_section);
        super.setBackBtn();
        super.setTitle("Section");
        this.mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        //this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        this.mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        this.mDataList = DataServer.getSampleData();
        SectionAdapter sectionAdapter = new SectionAdapter(R.layout.item_section_header, R.layout.item_section_content, this.mDataList);
        sectionAdapter.setOnItemClickListener(new SimpleClickListener() {
            @Override
            public void onItemClick(View view, BaseRecyclerViewHolder viewHolder, int position) {
                MySection mySection = mDataList.get(position);
                if (mySection.isSection) {
                    Toast.makeText(SectionActivity.this, mySection.sectionName, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(SectionActivity.this, mySection.data.getName(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        this.mRecyclerView.setAdapter(sectionAdapter);
    }
}
