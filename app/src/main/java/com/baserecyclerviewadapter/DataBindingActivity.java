package com.baserecyclerviewadapter;

import android.support.v7.app.AppCompatActivity;
import com.baserecyclerviewadapter.base.BaseActivity;

/**
 * 绑定数据
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class DataBindingActivity extends BaseActivity {

    //RecyclerView          mRecyclerView;
    //DataBindingUseAdapter mAdapter;
    //
    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
    //    super.onCreate(savedInstanceState);
    //    setBackBtn();
    //    setTitle("DataBinding Use");
    //    setContentView(R.layout.activity_data_binding_use);
    //
    //    mRecyclerView = (RecyclerView)findViewById(R.id.rv);
    //    mAdapter = new DataBindingUseAdapter(R.layout.item_movie, genData());
    //    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    //    mRecyclerView.setAdapter(mAdapter);
    //}
    //
    //
    //
    //private List<Movie> genData() {
    //    ArrayList<Movie> list = new ArrayList<>();
    //    Random random = new Random();
    //    for (int i = 0; i < 10; i++) {
    //        String name = "Movie " + i;
    //        int price = random.nextInt(10) + 10;
    //        int len = random.nextInt(80) + 60;
    //        Movie movie = new Movie(name, len, price);
    //        list.add(movie);
    //    }
    //    return list;
    //}
}
