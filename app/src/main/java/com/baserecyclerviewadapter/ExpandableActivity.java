package com.baserecyclerviewadapter;

import com.baserecyclerviewadapter.base.BaseActivity;

/**
 * 折叠item
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class ExpandableActivity extends BaseActivity {
    //    RecyclerView mRecyclerView;
    //
    //    @Override
    //    protected void onCreate(Bundle savedInstanceState) {
    //        super.onCreate(savedInstanceState);
    //        setBackBtn();
    //        setTitle("ExpandableItem Activity");
    //        setContentView(R.layout.activity_expandable_item_use);
    //
    //        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
    //        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    //
    //        ArrayList<MultiItemEntity> list = generateData();
    //        ExpandableItemAdapter adapter = new ExpandableItemAdapter(list);
    //
    //
    //        mRecyclerView.setAdapter(adapter);
    //
    ////        adapter.expandAll(3, true);
    //    }
    //
    //
    //
    //    private ArrayList<MultiItemEntity> generateData() {
    //        int lv0Count = 9;
    //        int lv1Count = 3;
    //        int personCount = 5;
    //
    //        String[] nameList = {"Bob", "Andy", "Lily", "Brown", "Bruce"};
    //        Random random = new Random();
    //
    //        ArrayList<MultiItemEntity> res = new ArrayList<>();
    //        for (int i = 0; i < lv0Count; i++) {
    //            Level0Item lv0 = new Level0Item("This is " + i + "th item in Level 0", "subtitle of " + i);
    //            for (int j = 0; j < lv1Count; j++) {
    //                Level1Item lv1 = new Level1Item("Level 1 item: " + j, "(no animation)");
    //                for (int k = 0; k < personCount; k++) {
    //                    lv1.addSubItem(new Person(nameList[k], random.nextInt(40)));
    //                }
    //                lv0.addSubItem(lv1);
    //            }
    //            res.add(lv0);
    //        }
    //        return res;
    //    }
}
