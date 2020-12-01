package com.example.tour_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<Article> articles;

    {
        articles = new ArrayList<>();
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
        articles.add(new Article());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager view = findViewById(R.id.view_pager);
        CategoriesFragmentPagerAdapter adapter = new CategoriesFragmentPagerAdapter(getSupportFragmentManager());
        view.setAdapter(adapter);
    }

    public void save(View view){

        boolean result = JSONHelper.exportToJSON(this, articles);
        if(result){
            Toast.makeText(this, "Данные сохранены", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Не удалось сохранить данные", Toast.LENGTH_LONG).show();
        }
    }
}
