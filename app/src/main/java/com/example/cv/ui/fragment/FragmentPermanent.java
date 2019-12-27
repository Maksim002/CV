package com.example.cv.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cv.R;
import com.example.cv.model.Model;
import com.example.cv.ui.adapters.recycler.AdapterAll;
import com.example.cv.ui.main.Listener;

import java.util.ArrayList;
import java.util.List;

public class FragmentPermanent extends Fragment implements Listener {

    private RecyclerView recyclerView;
    private AdapterAll adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_permanent,container,false);

        recyclerView = view.findViewById(R.id.recyclerViewPermanent);
        recyclerView.setAdapter(adapter = new AdapterAll(getPermanent(),this));
        adapter.updeteList(getPermanent());

        return view;
    }
    List<Model> getPermanent(){
        List<Model> list = new ArrayList<>();
        list.add(new Model("Лечение в подарок!","Бронируйте отдых на 5 или более суток \n и получайте лечение в подарок",R.drawable.image,R.drawable.ic_flame_1));
        list.add(new Model("Лечение в подарок!","Бронируйте отдых на 5 или более суток \n и получайте лечение в подарок",R.drawable.image,R.drawable.ic_flame_1));
        list.add(new Model("Лечение в подарок!","Бронируйте отдых на 5 или более суток \n и получайте лечение в подарок",R.drawable.image,R.drawable.ic_flame_1));
        list.add(new Model("Лечение в подарок!","Бронируйте отдых на 5 или более суток \n и получайте лечение в подарок",R.drawable.image,R.drawable.ic_flame_1));
        list.add(new Model("Лечение в подарок!","Бронируйте отдых на 5 или более суток \n и получайте лечение в подарок",R.drawable.image,R.drawable.ic_flame_1));
        list.add(new Model("Лечение в подарок!","Бронируйте отдых на 5 или более суток \n и получайте лечение в подарок",R.drawable.image,R.drawable.ic_flame_1));
        list.add(new Model("Лечение в подарок!","Бронируйте отдых на 5 или более суток \n и получайте лечение в подарок",R.drawable.image,R.drawable.ic_flame_1));
        list.add(new Model("Лечение в подарок!","Бронируйте отдых на 5 или более суток \n и получайте лечение в подарок",R.drawable.image,R.drawable.ic_flame_1));

        return list;
    }

    @Override
    public void OnClickGallery(Model model) {

    }
}
