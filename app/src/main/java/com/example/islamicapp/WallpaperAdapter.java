package com.example.islamicapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperAdapter.ViewHolder> {
    private List<Wallpaper_items> wallpapers;

    public WallpaperAdapter(List<Wallpaper_items> wallpapers) {
        this.wallpapers = wallpapers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wallpaper, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Wallpaper_items wallpaper = wallpapers.get(position);
        Picasso.get().load(wallpaper.getImageUrl()).into(holder.imageView);

        holder.itemView.setOnClickListener(v -> {
            // Handle image click, open viewer activity
            Intent intent = new Intent(holder.itemView.getContext(), ImageViewerActivity.class);
            intent.putExtra("image_url", wallpaper.getImageUrl());
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return wallpapers.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

    // No need for setWallpaper method here
}
