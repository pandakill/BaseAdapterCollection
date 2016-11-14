package org.panda.widget.adapter;

import android.content.Context;

import org.panda.widget.R;
import org.panda.widget.adapter.base.PBaseRecyclerViewAdapter;

/**
 * 创建人: pandakill
 * 创建时间: 2016/11/14 下午8:22
 * 描述: 简单的实体
 */
public class PSingleTypeAdapter extends PBaseRecyclerViewAdapter<String> {

    public PSingleTypeAdapter(Context context) {
        super(context);
    }

    @Override
    public int getItemLayoutID(int viewType) {
        return R.layout.item_view_single_text;
    }

    @Override
    protected void onBindDataToView(MLYBaseViewHolder holder, int position) {
        holder.setText(R.id.item_text, getItem(position));
    }
}
