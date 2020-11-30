package com.example.tour_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager view = findViewById(R.id.view_pager);
        CategoriesFragmentPagerAdapter adapter = new CategoriesFragmentPagerAdapter(getSupportFragmentManager());
        view.setAdapter(adapter);
    }
}
