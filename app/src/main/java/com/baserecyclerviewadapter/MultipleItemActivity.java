package com.baserecyclerviewadapter;

import com.baserecyclerviewadapter.base.BaseActivity;

/**
 * 多类型的item
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class MultipleItemActivity extends BaseActivity {
    //private RecyclerView mRecyclerView;
    //
    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
    //    super.onCreate(savedInstanceState);
    //    setContentView(R.layout.activity_multiple_item_use);
    //    setTitle("MultipleItem Use");
    //    setBackBtn();
    //    mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
    //    final List<MultipleItem> data = DataServer.getMultipleItemData();
    //    final MultipleItemQuickAdapter multipleItemAdapter = new MultipleItemQuickAdapter(this, data);
    //    final GridLayoutManager manager = new GridLayoutManager(this, 4);
    //    mRecyclerView.setLayoutManager(manager);
    //    multipleItemAdapter.setSpanSizeLookup(new BaseQuickAdapter.SpanSizeLookup() {
    //        @Override
    //        public int getSpanSize(GridLayoutManager gridLayoutManager, int position) {
    //            return data.get(position).getSpanSize();
    //        }
    //    });
    //    mRecyclerView.setAdapter(multipleItemAdapter);
    //}
}
