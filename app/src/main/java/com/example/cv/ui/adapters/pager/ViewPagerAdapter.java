package com.example.cv.ui.adapters.pager;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> list = new ArrayList<>();
    private List<String> titles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    public void setFragment(Fragment fragment, String title) {
        list.add(fragment);
        titles.add(title);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    public void setList(List<Fragment> list) {
        this.list = list;
        notifyDataSetChanged();
    }
}
