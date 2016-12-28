package com.baserecyclerviewadapter;

import com.baserecyclerviewadapter.base.BaseActivity;

/**
 * item点击
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class ItemClickActivity extends BaseActivity {

    //private RecyclerView     mRecyclerView;
    //private ItemClickAdapter itemClickAdapter;
    //private static final int    PAGE_SIZE = 10;
    //private static       String TAG       = "RecyclerClickItemActivity";
    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
    //    super.onCreate(savedInstanceState);
    //    setBackBtn();
    //    setTitle("ItemClickActivity Activity");
    //    setContentView(R.layout.activity_item_click);
    //    mRecyclerView = (RecyclerView) findViewById(R.id.list);
    //    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    //    initAdapter();
    //    mRecyclerView.addOnItemTouchListener(new OnItemClickListener() {
    //        @Override
    //        public void onSimpleItemClick(final BaseQuickAdapter adapter, final View view, final int position) {
    //            Log.d(TAG, "SimpleOnItemClick: ");
    //        }
    //    });
    //
    //
    //}
    //
    //private void initAdapter() {
    //    List<ClickEntity> data = new ArrayList<>();
    //    data.add(new ClickEntity(ClickEntity.CLICK_ITEM_VIEW));
    //    data.add(new ClickEntity(ClickEntity.CLICK_ITEM_CHILD_VIEW));
    //    data.add(new ClickEntity(ClickEntity.LONG_CLICK_ITEM_VIEW));
    //    data.add(new ClickEntity(ClickEntity.LONG_CLICK_ITEM_CHILD_VIEW));
    //    itemClickAdapter = new ItemClickAdapter(data);
    //    itemClickAdapter.openLoadAnimation();
    //    mRecyclerView.setAdapter(itemClickAdapter);
    //}
    //
    //
    //@Override
    //public boolean dispatchTouchEvent(MotionEvent ev) {
    //    return super.dispatchTouchEvent(ev);
    //}
}
