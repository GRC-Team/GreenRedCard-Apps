package com.example.nikkoekasaputra.greenredcardapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.nikkoekasaputra.greenredcardapp.Adapter.ViewPagerAdapter;
import com.example.nikkoekasaputra.greenredcardapp.Fragment.TabClassFragment;
import com.example.nikkoekasaputra.greenredcardapp.Fragment.TabDetailFragment;
import com.example.nikkoekasaputra.greenredcardapp.Fragment.TabStudentFragment;
import com.example.nikkoekasaputra.greenredcardapp.Fragment.TabTotalFragment;

public class ReportActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        createTab();
    }

    private void createTab() {
        TextView totalTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        totalTab.setText("Total");
        tabLayout.getTabAt(0).setCustomView(totalTab);

        TextView studentTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        studentTab.setText("Student");
        tabLayout.getTabAt(1).setCustomView(studentTab);

        TextView classTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        classTab.setText("Class");
        tabLayout.getTabAt(2).setCustomView(classTab);

        TextView detailTab = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        detailTab.setText("Detail");
        tabLayout.getTabAt(3).setCustomView(detailTab);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabTotalFragment(), "Total");
        adapter.addFragment(new TabStudentFragment(), "Student");
        adapter.addFragment(new TabClassFragment(), "Class");
        adapter.addFragment(new TabDetailFragment(), "Detail");
        viewPager.setAdapter(adapter);
    }
}