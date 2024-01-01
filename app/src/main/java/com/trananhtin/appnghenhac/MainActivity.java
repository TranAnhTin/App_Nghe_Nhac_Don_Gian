package com.trananhtin.appnghenhac;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView playMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        playMedia = findViewById(R.id.pm);
//        playMedia.setText("PlayMedia");
        initViewPager();
    }

    private void initViewPager() {
        ViewPager viewPager=findViewById(R.id.viewPager);
        TabLayout tabLayout=findViewById(R.id.tabLayout);
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Fragment_TrangChu(),"Trang chủ");
        viewPagerAdapter.addFragment(new Fragment_TimKiem(),"Tìm kiếm");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.icontrangchu);
        tabLayout.getTabAt(1).setIcon(R.drawable.icontimkiem);

    }
    public static class ViewPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> arrayFragment;
        private ArrayList<String> arrayTitle;

        public ViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
            this.arrayFragment=new ArrayList<>();
            this.arrayTitle=new ArrayList<>();
        }
        void addFragment (Fragment fragment, String title){
            arrayFragment.add(fragment);
            arrayTitle.add(title);
        }
        @NonNull
        @Override
        public Fragment getItem(int position) {
            return arrayFragment.get(position);
        }

        @Override
        public int getCount() {
            return arrayFragment.size();
        }
    }
}