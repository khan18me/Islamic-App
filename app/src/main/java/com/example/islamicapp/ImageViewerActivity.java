package com.example.islamicapp;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ImageViewerActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button setWallpaperButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);

        String imageUrl = getIntent().getStringExtra("image_url");

        imageView = findViewById(R.id.fullSizeImageView);
        setWallpaperButton = findViewById(R.id.setWallpaperButton);

        Picasso.get().load(imageUrl).into(imageView);

        setWallpaperButton.setOnClickListener(v -> {
            setWallpaper(imageUrl);
        });
    }

    private void setWallpaper(String imageUrl) {
        new SetWallpaperTask().execute(imageUrl);
    }

    private class SetWallpaperTask extends AsyncTask<String, Void, Bitmap> {
        @Override
        protected Bitmap doInBackground(String... params) {
            try {
                String imageUrl = params[0];
                InputStream inputStream = new URL(imageUrl).openStream();
                return BitmapFactory.decodeStream(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        protected void onPostExecute(Bitmap bitmap) {
            if (bitmap != null) {
                WallpaperManager wallpaperManager = WallpaperManager.getInstance(ImageViewerActivity.this);
                try {
                    wallpaperManager.setBitmap(bitmap);
                    Toast.makeText(ImageViewerActivity.this, "Wallpaper set successfully", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                    Toast.makeText(ImageViewerActivity.this, "Failed to set wallpaper", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}