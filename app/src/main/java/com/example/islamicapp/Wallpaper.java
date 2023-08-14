package com.example.islamicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Wallpaper extends AppCompatActivity {
    private RecyclerView recyclerView;
    private WallpaperAdapter adapter;



    private String[] imageUrls = {
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F20515303.jpg?alt=media&token=52bf496b-6764-451b-92be-ab478db9d72e",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2F20515407.jpg?alt=media&token=061c164d-4a24-4233-9ff3-8cd495e50c55",
            // Add the remaining URLs here
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-islamic-islam-jumma-black-allah-thumbnail.jpg?alt=media&token=f81da308-092c-468c-8262-e4bdb5ef1584",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-islamic-top-30-best-islamic-backgrounds-1080x2160-for-your-mobile-tablet-ultra-islamic-iphone.jpg?alt=media&token=41664f82-08f2-48cc-a83d-0943eb1b692f",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fimages.jpg?alt=media&token=b42bf851-97c2-42ba-b76a-d4aa45d6d297",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fwallpaper2you_323418.jpg?alt=media&token=e774ec92-eefa-4d97-899f-e3d54eba6abf",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fcd4f107ab341cc919fe5b59c787af54b.jpg?alt=media&token=2bb62bc2-c77d-4819-a007-b7f829764f94",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-allah-gold-dua-art-islam-islamic-prayer-thumbnail.jpg?alt=media&token=68ee98e0-bc1e-45fe-96ff-c760c7d40929",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-islamic-islam-mosque.jpg?alt=media&token=7ca99111-ae5b-40b1-ac85-60e00348ca33",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/wallpapers%2Fdesktop-wallpaper-islamic-iphone-islam.jpg?alt=media&token=b73f9f3f-5b60-4844-bb91-a0d3365372bb"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // GridLayoutManager with 2 columns

        List<Wallpaper_items> wallpapers = new ArrayList<>();
        for (String imageUrl : imageUrls) {
            wallpapers.add(new Wallpaper_items(imageUrl));
        }

        adapter = new WallpaperAdapter(wallpapers);
        recyclerView.setAdapter(adapter);
    }
}