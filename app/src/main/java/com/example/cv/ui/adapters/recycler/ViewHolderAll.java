package com.example.cv.ui.adapters.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.cv.R;
import com.example.cv.model.Model;
import com.example.cv.ui.adapters.base.BaseViewHolder;

class ViewHolderAll extends BaseViewHolder<Model> {
    private ImageView imagePhoto,imageIcon;
    private TextView textDescription,tile;

    public ViewHolderAll(@NonNull View itemView) {
        super(itemView);
        imagePhoto = itemView.findViewById(R.id.imagePhoto);
        imageIcon = itemView.findViewById(R.id.imageIcon);

        textDescription = itemView.findViewById(R.id.textDescription);
        tile = itemView.findViewById(R.id.tile);
    }

    @Override
    public void bind(Model data) {
        imagePhoto.setImageResource(data.getImage());
        imageIcon.setImageResource(data.getIcon());

        textDescription.setText(data.getTitle());
        tile.setText(data.getName());

    }

    @Override
    public void unbind() {

    }
}
