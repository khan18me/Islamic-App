package com.pyaraislam.islamicapp;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

   private List<String> imageUrls;

   public ImageAdapter(List<String> imageUrls) {
      this.imageUrls = imageUrls;
   }

   @NonNull
   @Override
   public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
      return new ViewHolder(view);
   }

   @Override
   public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      String imageUrl = imageUrls.get(position);

      holder.shareImageButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, imageUrl);
            v.getContext().startActivity(Intent.createChooser(shareIntent, "Share Image"));
         }
      });

      holder.downloadImageButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            downloadImage(imageUrl, v.getContext());
         }
      });

      // Load the image directly into the ImageView using Picasso
      Picasso.get().load(imageUrl).into(holder.imageView);
   }

   @Override
   public int getItemCount() {
      return imageUrls.size();
   }

   static class ViewHolder extends RecyclerView.ViewHolder {

      ImageView imageView;
      ImageButton shareImageButton;
      ImageButton downloadImageButton;

      ViewHolder(@NonNull View itemView) {
         super(itemView);
         imageView = itemView.findViewById(R.id.imageView);
         shareImageButton = itemView.findViewById(R.id.shareImageButton);
         downloadImageButton = itemView.findViewById(R.id.downloadImageButton);
      }
   }

   private void downloadImage(String imageUrl, Context context) {
      DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
      Uri uri = Uri.parse(imageUrl);

      DownloadManager.Request request = new DownloadManager.Request(uri);
      request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
      request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "image.jpg");

      if (downloadManager != null) {
         downloadManager.enqueue(request);
      }
   }
}