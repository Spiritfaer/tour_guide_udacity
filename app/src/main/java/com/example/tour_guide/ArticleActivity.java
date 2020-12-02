package com.example.tour_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);

        Article article = getIntent().getParcelableExtra("Article");

        TextView textHeader = findViewById(R.id.item_header);
        textHeader.setText(article.getHeader());

        ImageView imageView = findViewById(R.id.item_image);
        imageView.setImageResource(article.getImageResource());

        TextView textText = findViewById(R.id.item_text);
        textText.setText(article.getText());
    }
}