package com.example.tour_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

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
        setContentView(R.layout.item_list);

        //find a listView to fills with our articles
        ListView listView = findViewById(R.id.item_list_id);
        //Create our adapter
        ArticleAdapter adapter = new ArticleAdapter(this, R.layout.item, articles);
        //Link listView and adapter
        listView.setAdapter(adapter);
    }
}
