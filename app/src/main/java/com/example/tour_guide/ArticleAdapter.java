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
    static private class ViewHolder {
        private TextView itemHeader;
        private ImageView itemImage;
        private TextView itemText;
    }

    public ArticleAdapter(@NonNull Context context, int resource, ArrayList<Article> articles) {
        super(context, resource, articles);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Article article = getItem(position);
        ViewHolder viewHolder;
        //If old view was deleted, we should create view for show
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.short_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.itemHeader = convertView.findViewById(R.id.short_item_header);
            viewHolder.itemImage = convertView.findViewById(R.id.short_item_image);
            viewHolder.itemText = convertView.findViewById(R.id.short_item_text);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.itemHeader.setText(article.getHeader());
        viewHolder.itemImage.setImageResource(article.getImageResource());
        viewHolder.itemText.setText(article.getSummeryText());

        //return filling view
        return convertView;
    }
}
