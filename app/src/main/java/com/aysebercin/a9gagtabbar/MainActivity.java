package com.aysebercin.a9gagtabbar;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    SectionsPageAdapter sectionsPageAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.view_pager);
        setupPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.mipmap.ic_launcher);
        tabLayout.getTabAt(1).setIcon(R.mipmap.ic_launcher);
        tabLayout.getTabAt(2).setIcon(R.mipmap.ic_launcher);


    }

    private void setupPager(ViewPager viewPager){

        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentHot(),"Hot");
        adapter.addFragment(new FragmentTrending(),"Trending");
        adapter.addFragment(new FragmentFresh(),"Fresh");
        viewPager.setAdapter(adapter);

    }
}