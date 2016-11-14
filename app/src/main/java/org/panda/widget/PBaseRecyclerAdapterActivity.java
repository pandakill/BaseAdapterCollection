package org.panda.widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.panda.widget.adapter.PSingleTypeAdapter;

import java.util.ArrayList;

/**
 * 创建人: pandakill
 * 创建时间: 2016/11/14 下午8:14
 * 描述:
 */
public class PBaseRecyclerAdapterActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_base_recycler_adapter);

        initView();
        afterView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.canScrollVertically();
        mRecyclerView.setLayoutManager(layoutManager);
    }

    private void afterView() {
        PSingleTypeAdapter singleTypeAdapter = new PSingleTypeAdapter(this);
        mRecyclerView.setAdapter(singleTypeAdapter);
        singleTypeAdapter.setItems(getModel());
    }

    private ArrayList<String> getModel() {
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            strList.add("第" + i + "个");
        }

        return strList;
    }
}
