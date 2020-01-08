package com.example.recyclercards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleItems = new ArrayList<>();

        exampleItems.add(new ExampleItem(R.drawable.node, "Clicked at Studio"));
        exampleItems.add(new ExampleItem(R.drawable.oner, "Clicked at Italy"));
        exampleItems.add(new ExampleItem(R.drawable.twor, "Clicked at Rome"));
        exampleItems.add(new ExampleItem(R.drawable.threer, "Clicked at London"));
        exampleItems.add(new ExampleItem(R.drawable.fourr, "Clicked at New York"));
        exampleItems.add(new ExampleItem(R.drawable.fiver, "Clicked at L.A"));
        exampleItems.add(new ExampleItem(R.drawable.sixr, "Clicked at India"));

//        Config for RecyclerView

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(exampleItems);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);



    }
}
