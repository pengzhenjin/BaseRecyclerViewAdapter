package com.baserecyclerviewadapter;

import com.baserecyclerviewadapter.base.BaseActivity;

/**
 * 分组
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class SectionActivity extends BaseActivity {
    //private RecyclerView    mRecyclerView;
    //private List<MySection> mData;
    //
    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
    //    super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_section_uer);
    //    setBackBtn();
    //    setTitle("Section Use");
    //    mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
    //    mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    //    mData = DataServer.getSampleData();
    //    SectionAdapter sectionAdapter = new SectionAdapter(R.layout.item_section_content, R.layout.def_section_head, mData);
    //    mRecyclerView.addOnItemTouchListener(new OnItemClickListener() {
    //
    //        @Override
    //        public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
    //            MySection mySection = mData.get(position);
    //            if (mySection.isHeader)
    //                Toast.makeText(SectionActivity.this, mySection.header, Toast.LENGTH_LONG).show();
    //            else
    //                Toast.makeText(SectionActivity.this, mySection.t.getName(), Toast.LENGTH_LONG).show();
    //        }
    //
    //        @Override
    //        public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
    //            Toast.makeText(SectionActivity.this, "onItemChildClick" + position, Toast.LENGTH_LONG).show();
    //        }
    //
    //
    //    });
    //    mRecyclerView.setAdapter(sectionAdapter);
    //}
}
