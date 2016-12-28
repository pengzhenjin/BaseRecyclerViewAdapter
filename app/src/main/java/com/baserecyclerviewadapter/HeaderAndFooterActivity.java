package com.baserecyclerviewadapter;

import com.baserecyclerviewadapter.base.BaseActivity;

/**
 * 头部和尾部
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class HeaderAndFooterActivity extends BaseActivity {

    //    private RecyclerView           mRecyclerView;
    //    private HeaderAndFooterAdapter headerAndFooterAdapter;
    //    private static final int PAGE_SIZE = 3;
    //
    //    @Override
    //    protected void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //        setBackBtn();
    //        setTitle("HeaderAndFooter Use");
    ////        Window window = this.getWindow();
    //        //取消设置透明状态栏,使 ContentView 内容不再覆盖状态栏
    ////        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
    //        //需要设置这个 flag 才能调用 setStatusBarColor 来设置状态栏颜色
    ////        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
    ////        //设置状态栏颜色
    ////        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
    ////            window.setStatusBarColor(Color.TRANSPARENT);
    ////        }
    //        setContentView(R.layout.activity_header_and_footer_use);
    //        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
    //        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    //        initAdapter();
    //
    //        View headerView = getView(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //                headerAndFooterAdapter.addHeaderView(getView(getRemoveHeaderListener(), "click me to remove me"), 0);
    //            }
    //        }, "click me to add new header");
    //        headerAndFooterAdapter.addHeaderView(headerView);
    //
    //        View footerView = getView(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //                headerAndFooterAdapter.addFooterView(getView(getRemoveFooterListener(), "click me to remove me"));
    //            }
    //        }, "click me to add new footer");
    //        footerView = getLayoutInflater().inflate(R.layout.footer_view, (ViewGroup) mRecyclerView.getParent(), false);
    //        headerAndFooterAdapter.addFooterView(footerView, 0);
    //
    //        mRecyclerView.setAdapter(headerAndFooterAdapter);
    ////        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    ////        setSupportActionBar(toolbar);
    //
    ////        CollapsingToolbarLayout collapsingToolbar =
    ////                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
    ////        collapsingToolbar.setTitle("HeaderAndFooterActivity");
    //
    ////        loadBackdrop();
    //    }
    //
    ////    private void loadBackdrop() {
    ////        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
    ////        Glide.with(this).load(R.mipmap.header_bg).centerCrop().into(imageView);
    ////    }
    //
    //
    //    private View getView(View.OnClickListener listener, String text) {
    //        View view = getLayoutInflater().inflate(R.layout.head_view, (ViewGroup) mRecyclerView.getParent(), false);
    //        view.setOnClickListener(listener);
    //        return view;
    //    }
    //
    //    private View.OnClickListener getRemoveHeaderListener() {
    //        return new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //                headerAndFooterAdapter.removeHeaderView(v);
    //            }
    //        };
    //    }
    //
    //    private View.OnClickListener getRemoveFooterListener() {
    //        return new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //                headerAndFooterAdapter.removeFooterView(v);
    //            }
    //        };
    //    }
    //
    //    private void initAdapter() {
    //        headerAndFooterAdapter = new HeaderAndFooterAdapter(PAGE_SIZE);
    //        headerAndFooterAdapter.openLoadAnimation();
    //        mRecyclerView.setAdapter(headerAndFooterAdapter);
    //        mRecyclerView.addOnItemTouchListener(new OnItemClickListener() {
    //            @Override
    //            public void onSimpleItemClick(BaseQuickAdapter adapter, View view, int position) {
    //                Toast.makeText(HeaderAndFooterActivity.this, "" + Integer.toString(position), Toast.LENGTH_LONG).show();
    //            }
    //        });
    //
    //    }
}
