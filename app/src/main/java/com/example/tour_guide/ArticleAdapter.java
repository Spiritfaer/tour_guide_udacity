package com.example.tour_guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ArticleAdapter extends ArrayAdapter<Article> {
    public ArticleAdapter(@NonNull Context context, int resource, ArrayList<Article> articles) {
        super(context, resource, articles);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Article article = getItem(position);

        //We should create view for show
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        //Set header for our article
        TextView itemHeader = convertView.findViewById(R.id.item_header);
        itemHeader.setText(article.getHeader());

        //Set image for our article
        ImageView itemImage = convertView.findViewById(R.id.item_image);
        if (article.hasImage()) {
            itemImage.setImageResource(article.getImageResource());
        }

        //set text for our article, but only first 256 characters
        TextView itemText = convertView.findViewById(R.id.item_text);
        itemText.setText(article.getSummeryText());

        //return filling view
        return convertView;
    }
}
