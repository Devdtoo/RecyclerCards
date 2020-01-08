package com.example.recyclercards;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    //6.2 Declare the ArrayList of ExampleItem type
    public ArrayList<ExampleItem> mExampleList;

    // step 1- Create This class
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        //4.1  Declare Storage Views

        public ImageView imageView;
        public TextView textView;


        // 2. Generate this constructor
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);

            //4.2  Find/Grab the Views by ID

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);


        }
    }

    //6.1  Generate this Constructor to Pass the ArrayList of items
    public ExampleAdapter(ArrayList<ExampleItem> exampleList) {
        mExampleList = exampleList;
    }

    //3. Implement these three Methods
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //5. Inflate - We have to Inflate the views for the customisation we have done Above.

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {


        //7
        ExampleItem currentItem = mExampleList.get(position);
        holder.imageView.setImageResource(currentItem.getmImageResource());
        holder.textView.setText(currentItem.getmText());
    }

    @Override
    public int getItemCount() {

        //8. Return ArrayList size
        return mExampleList.size();
    }
}
