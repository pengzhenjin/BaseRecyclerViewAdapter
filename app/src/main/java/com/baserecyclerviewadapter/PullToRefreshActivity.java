package com.baserecyclerviewadapter;

import android.support.v4.widget.SwipeRefreshLayout;
import com.baserecyclerviewadapter.base.BaseActivity;
import com.recyclerview.library.BaseRecyclerViewAdapter;

/**
 * 下拉刷新和下拉加载更多
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class PullToRefreshActivity extends BaseActivity implements SwipeRefreshLayout.OnRefreshListener {
    //    private RecyclerView         mRecyclerView;
    //    private PullToRefreshAdapter pullToRefreshAdapter;
    //    private SwipeRefreshLayout   mSwipeRefreshLayout;
    //
    //    private static final int TOTAL_COUNTER = 18;
    //
    //    private static final int PAGE_SIZE = 6;
    //
    //    private int delayMillis = 1000;
    //
    //    private int mCurrentCounter = 0;
    //
    //    private boolean isErr;
    //    private boolean mLoadMoreEndGone = false;
    //
    //    @Override
    //    protected void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //
    //        setContentView(R.layout.activity_main);
    //        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
    //        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeLayout);
    //        mSwipeRefreshLayout.setOnRefreshListener(this);
    //        mSwipeRefreshLayout.setColorSchemeColors(Color.rgb(47, 223, 189));
    //        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    //        setTitle("Pull TO Refresh Use");
    //        setBackBtn();
    //        initAdapter();
    ////        addHeadView();
    //    }
    //
    ////    private void addHeadView() {
    ////        View headView = getLayoutInflater().inflate(R.layout.head_view, (ViewGroup) mRecyclerView.getParent(), false);
    ////        ((TextView) headView.findViewById(R.id.tv)).setText("click use custom load view");
    ////        headView.setOnClickListener(new View.OnClickListener() {
    ////            @Override
    ////            public void onClick(View v) {
    ////                mLoadMoreEndGone = true;
    ////                pullToRefreshAdapter.setLoadMoreView(new CustomLoadMoreView());
    ////                mRecyclerView.setAdapter(pullToRefreshAdapter);
    ////                Toast.makeText(PullToRefreshActivity.this, "use ok!", Toast.LENGTH_LONG).show();
    ////            }
    ////        });
    ////        pullToRefreshAdapter.addHeaderView(headView);
    ////    }

    //@Override
    //public void onLoadMoreRequested() {
    //        mSwipeRefreshLayout.setEnabled(false);
    //        mRecyclerView.postDelayed(new Runnable() {
    //            @Override
    //            public void run() {
    //                if (mCurrentCounter >= TOTAL_COUNTER) {
    ////                    pullToRefreshAdapter.loadMoreEnd();//default visible
    //                    pullToRefreshAdapter.loadMoreEnd(mLoadMoreEndGone);//true is gone,false is visible
    //                } else {
    //                    if (isErr) {
    //                        pullToRefreshAdapter.addData(DataServer.getSampleData(PAGE_SIZE));
    //                        mCurrentCounter = pullToRefreshAdapter.getData().size();
    //                        pullToRefreshAdapter.loadMoreComplete();
    //                    } else {
    //                        isErr = true;
    //                        Toast.makeText(PullToRefreshActivity.this, R.string.network_err, Toast.LENGTH_LONG).show();
    //                        pullToRefreshAdapter.loadMoreFailed();
    //
    //                    }
    //                }
    //                mSwipeRefreshLayout.setEnabled(true);
    //            }
    //
    //        },delayMillis);
    //}

    @Override
    public void onRefresh() {
        //pullToRefreshAdapter.setEnableLoadMore(false);
        //new Handler().postDelayed(new Runnable() {
        //    @Override
        //    public void run() {
        //        pullToRefreshAdapter.setNewData(DataServer.getSampleData(PAGE_SIZE));
        //        isErr = false;
        //        mCurrentCounter = PAGE_SIZE;
        //        mSwipeRefreshLayout.setRefreshing(false);
        //        pullToRefreshAdapter.setEnableLoadMore(true);
        //    }
        //}, delayMillis);
    }
    //
    //    private void initAdapter() {
    //        pullToRefreshAdapter = new PullToRefreshAdapter();
    //        pullToRefreshAdapter.setOnLoadMoreListener(this);
    //        pullToRefreshAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT);
    ////        pullToRefreshAdapter.setAutoLoadMoreSize(3);
    //        mRecyclerView.setAdapter(pullToRefreshAdapter);
    //        mCurrentCounter = pullToRefreshAdapter.getData().size();
    //
    //        mRecyclerView.addOnItemTouchListener(new OnItemClickListener() {
    //            @Override
    //            public void onSimpleItemClick(final BaseQuickAdapter adapter, final View view, final int position) {
    //                Toast.makeText(PullToRefreshActivity.this, Integer.toString(position), Toast.LENGTH_LONG).show();
    //            }
    //        });
    //    }
    //
}
