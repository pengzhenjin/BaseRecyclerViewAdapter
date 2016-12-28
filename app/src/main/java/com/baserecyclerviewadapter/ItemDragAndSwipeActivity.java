package com.baserecyclerviewadapter;

import com.baserecyclerviewadapter.base.BaseActivity;

/**
 * item滑动删除
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class ItemDragAndSwipeActivity extends BaseActivity {
    //    private static final String TAG = ItemDragAndSwipeActivity.class.getSimpleName();
    //    private RecyclerView             mRecyclerView;
    //    private List<String>             mData;
    //    private ItemDragAdapter          mAdapter;
    //    private ItemTouchHelper          mItemTouchHelper;
    //    private ItemDragAndSwipeCallback mItemDragAndSwipeCallback;
    //
    //    @Override
    //    protected void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //        setContentView(R.layout.activity_item_touch_use);
    //        setBackBtn();
    //        setTitle("ItemDrag  And Swipe");
    //        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
    //        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    //        mData = generateData(50);
    //        OnItemDragListener listener = new OnItemDragListener() {
    //            @Override
    //            public void onItemDragStart(RecyclerView.ViewHolder viewHolder, int pos) {
    //                Log.d(TAG, "drag start");
    //                BaseRecyclerViewHolder holder = ((BaseRecyclerViewHolder) viewHolder);
    ////                holder.setTextColor(R.id.tv, Color.WHITE);
    //            }
    //
    //            @Override
    //            public void onItemDragMoving(RecyclerView.ViewHolder source, int from, RecyclerView.ViewHolder target, int to) {
    //                Log.d(TAG, "move from: " + source.getAdapterPosition() + " to: " + target.getAdapterPosition());
    //            }
    //
    //            @Override
    //            public void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int pos) {
    //                Log.d(TAG, "drag end");
    //                BaseRecyclerViewHolder holder = ((BaseRecyclerViewHolder) viewHolder);
    ////                holder.setTextColor(R.id.tv, Color.BLACK);
    //            }
    //        };
    //        final Paint paint = new Paint();
    //        paint.setAntiAlias(true);
    //        paint.setTextSize(20);
    //        paint.setColor(Color.BLACK);
    //        OnItemSwipeListener onItemSwipeListener = new OnItemSwipeListener() {
    //            @Override
    //            public void onItemSwipeStart(RecyclerView.ViewHolder viewHolder, int pos) {
    //                Log.d(TAG, "view swiped start: " + pos);
    //                BaseRecyclerViewHolder holder = ((BaseRecyclerViewHolder) viewHolder);
    ////                holder.setTextColor(R.id.tv, Color.WHITE);
    //            }
    //
    //            @Override
    //            public void clearView(RecyclerView.ViewHolder viewHolder, int pos) {
    //                Log.d(TAG, "View reset: " + pos);
    //                BaseRecyclerViewHolder holder = ((BaseRecyclerViewHolder) viewHolder);
    ////                holder.setTextColor(R.id.tv, Color.BLACK);
    //            }
    //
    //            @Override
    //            public void onItemSwiped(RecyclerView.ViewHolder viewHolder, int pos) {
    //                Log.d(TAG, "View Swiped: " + pos);
    //            }
    //
    //            @Override
    //            public void onItemSwipeMoving(Canvas canvas, RecyclerView.ViewHolder viewHolder, float dX, float dY, boolean isCurrentlyActive) {
    //                canvas.drawColor(ContextCompat.getColor(ItemDragAndSwipeActivity.this, R.color.color_light_blue));
    ////                canvas.drawText("Just some text", 0, 40, paint);
    //            }
    //        };
    //
    //        mAdapter = new ItemDragAdapter(mData);
    //        mItemDragAndSwipeCallback = new ItemDragAndSwipeCallback(mAdapter);
    //        mItemTouchHelper = new ItemTouchHelper(mItemDragAndSwipeCallback);
    //        mItemTouchHelper.attachToRecyclerView(mRecyclerView);
    //
    //        //mItemDragAndSwipeCallback.setDragMoveFlags(ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT | ItemTouchHelper.UP | ItemTouchHelper.DOWN);
    //        mItemDragAndSwipeCallback.setSwipeMoveFlags(ItemTouchHelper.START | ItemTouchHelper.END);
    //        mAdapter.enableSwipeItem();
    //        mAdapter.setOnItemSwipeListener(onItemSwipeListener);
    //        mAdapter.enableDragItem(mItemTouchHelper);
    //        mAdapter.setOnItemDragListener(listener);
    //
    //
    //        mRecyclerView.setAdapter(mAdapter);
    //    }
    //
    //    private List<String> generateData(int size) {
    //        ArrayList<String> data = new ArrayList(size);
    //        for (int i = 0; i < size; i++) {
    //            data.add("item " + i);
    //        }
    //        return data;
    //    }
}
