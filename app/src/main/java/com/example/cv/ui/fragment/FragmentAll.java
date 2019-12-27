package com.example.cv.ui.fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cv.R;
import com.example.cv.model.Model;
import com.example.cv.ui.adapters.recycler.AdapterAll;
import com.example.cv.ui.main.Listener;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FragmentAll extends Fragment implements Listener {

    private RecyclerView recyclerView;
    private AdapterAll adapter;
    private AppBarConfiguration mAppBarConfiguration;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all,container,false);

        recyclerView = view.findViewById(R.id.recyclerViewAll);
        recyclerView.setAdapter(adapter = new AdapterAll(getAll(),this));
        adapter.updeteList(getAll());

        return view;

    }
    List<Model> getAll(){
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
//        Navigation.findNavController(Objects.requireNonNull(getView())).navigate(R.id.blankFragment);
    }
}
