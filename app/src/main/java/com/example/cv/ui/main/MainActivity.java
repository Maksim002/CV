package com.example.cv.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;;
import android.os.Bundle;

import com.example.cv.R;
import com.example.cv.ui.fragment.FragmentAll;
import com.example.cv.ui.fragment.FragmentBurning;
import com.example.cv.ui.fragment.FragmentPermanent;
import com.example.cv.ui.adapters.pager.ViewPagerAdapter;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private TabLayout tableLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbarActivity);
        toolbar.setTitle("Акции и события");
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorAccent));
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.pager);
        tableLayout = findViewById(R.id.tablayout);

        setupViewPager();

    }

    private void setupViewPager(){
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setOffscreenPageLimit(3);
        adapter.setFragment(new FragmentAll(),"Всё");
        adapter.setFragment(new FragmentBurning(),"Горящие");
        adapter.setFragment(new FragmentPermanent(),"Постоянные");
        tableLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);
    }

}
