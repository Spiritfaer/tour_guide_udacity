package com.example.tour_guide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ArchitectureFragment extends Fragment {

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

    public ArchitectureFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        //find a listView to fills with our articles
        ListView listView = rootView.findViewById(R.id.item_list_id);

        if (getActivity() != null) {
            //Create our adapter
            ArticleAdapter adapter = new ArticleAdapter(getActivity(), R.layout.item, articles);
            //Link listView and adapter
            listView.setAdapter(adapter);
        }

        return rootView;
    }
}
