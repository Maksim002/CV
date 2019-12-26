package com.example.cv.ui.adapters.recycler;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.cv.R;
import com.example.cv.model.Model;
import com.example.cv.ui.adapters.base.BaseRecyclerAdaptor;
import com.example.cv.ui.adapters.base.BaseViewHolder;
import com.example.cv.ui.main.Listener;

import java.util.List;

public class AdapterAll extends BaseRecyclerAdaptor<ViewHolderAll, Model> {

    public AdapterAll(List<Model> list, Listener listener) {
        super(list, listener);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.item_all;
    }

    @Override
    protected ViewHolderAll getViewHolder(View view) {
        return new ViewHolderAll(view);
    }
}
