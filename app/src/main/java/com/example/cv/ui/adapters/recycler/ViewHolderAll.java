package com.example.cv.ui.adapters.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.cv.R;
import com.example.cv.model.Model;
import com.example.cv.ui.adapters.base.BaseViewHolder;
import com.example.cv.ui.main.Listener;

class ViewHolderAll extends BaseViewHolder<Model> {
    private ImageView imagePhoto,imageIcon;
    private TextView textDescription,tile;
    private LinearLayout linearLayout;
    private Listener listener;

    public ViewHolderAll(@NonNull View itemView,Listener listener) {
        super(itemView);
        imagePhoto = itemView.findViewById(R.id.imagePhoto);
        imageIcon = itemView.findViewById(R.id.imageIcon);
        linearLayout = itemView.findViewById(R.id.listNew);
        this.listener = listener;

        textDescription = itemView.findViewById(R.id.textDescription);
        tile = itemView.findViewById(R.id.tile);
    }

    @Override
    public void bind(final Model data) {
        imagePhoto.setImageResource(data.getImage());
        imageIcon.setImageResource(data.getIcon());

        textDescription.setText(data.getTitle());
        tile.setText(data.getName());

        tile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnClickGallery(data);
            }
        });
    }

    @Override
    public void unbind() {

    }
}
