package com.example.tour_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testView();
    }

    private void testView() {
        Article article = initOneItem();
        TextView textHeader = findViewById(R.id.item_header);
        TextView textText = findViewById(R.id.item_text);
        ImageView imageView = findViewById(R.id.item_image);


        textHeader.setText(article.getHeader());
        textText.setText(article.getText());
        if (article.hasImage()) {
            imageView.setImageResource(article.getImageResource());
        }
    }

    private Article initOneItem() {
        return new Article(getString(R.string.example_header), getString(R.string.example_text), R.drawable.coat_of_arms_of_dnipro);
    }
}