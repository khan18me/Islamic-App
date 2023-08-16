package com.pyaraislam.islamicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;

import java.util.ArrayList;
import java.util.List;

public class posts extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ImageAdapter imageAdapter;
    private List<String> imageUrls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        imageUrls = new ArrayList<>();
        imageAdapter = new ImageAdapter(imageUrls);
        recyclerView.setAdapter(imageAdapter);

        // Replace these URLs with actual image URLs
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-islamic-islam-jumma-black-allah-thumbnail.jpg?alt=media&token=f81da308-092c-468c-8262-e4bdb5ef1584");
        imageUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-islamic-islam-jumma-black-allah-thumbnail.jpg?alt=media&token=f81da308-092c-468c-8262-e4bdb5ef1584");
        // ... Add the remaining URLs

        imageAdapter.notifyDataSetChanged();
    }
}