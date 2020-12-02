package com.example.tour_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager view = findViewById(R.id.view_pager);
        CategoriesFragmentPagerAdapter adapter = new CategoriesFragmentPagerAdapter(getSupportFragmentManager());
        view.setAdapter(adapter);
    }

    public void save(View view, ArrayList<Article> articles){

        boolean result = JSONHelper.exportToJSON(this, articles);
        if(result){
            Toast.makeText(this, "Данные сохранены", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Не удалось сохранить данные", Toast.LENGTH_LONG).show();
        }
    }

/* --------------- reference code -----------------
    private class temp {

        private class Phone {
            private String name;
            private int price;

            Phone(String name, int price){
                this.name = name;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            @Override
            public String toString(){
                return name + " " + price;
            }
        }

        private ArrayAdapter<Phone> adapter;
        private EditText nameText, priceText;
        private List<Phone> phones;
        ListView listView;

        public void addPhone(View view){
            String name = nameText.getText().toString();
            int price = Integer.parseInt(priceText.getText().toString());
            ContactsContract.CommonDataKinds.Phone phone = new Phone(name, price);
            phones.add(phone);
            adapter.notifyDataSetChanged();
        }

        public void save(View view){

            boolean result = JSONHelper.exportToJSON(this, phones);
            if(result){
                Toast.makeText(this, "Данные сохранены", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this, "Не удалось сохранить данные", Toast.LENGTH_LONG).show();
            }
        }
        public void open(View view){
            phones = JSONHelper.importFromJSON(this);
            if(phones!=null){
                adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, phones);
                listView.setAdapter(adapter);
                Toast.makeText(this, "Данные восстановлены", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this, "Не удалось открыть данные", Toast.LENGTH_LONG).show();
            }
        }
    }
*/
}

