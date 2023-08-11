package com.example.islamicapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.islamicapp.fragment.Read_By_Para;
import com.example.islamicapp.fragment.Read_By_Surah;

class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Read_By_Para();
            case 1:
                return new Read_By_Surah();
            default:
                return new Read_By_Para();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
