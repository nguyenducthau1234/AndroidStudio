package com.thaund187199.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ItemModel> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list_view);

        items = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            items.add(new ItemModel("Email " + (i + 1), "This is the content of the email"));

        ItemAdapter adapter = new ItemAdapter(items);
        listView.setAdapter(adapter);
    }
}