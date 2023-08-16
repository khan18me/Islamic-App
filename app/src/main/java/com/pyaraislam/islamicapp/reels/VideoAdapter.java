package com.pyaraislam.islamicapp.reels;

import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;

import org.checkerframework.checker.nullness.qual.NonNull;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

   private String[] videoUrls;

   public VideoAdapter(String[] videoUrls) {
      this.videoUrls = videoUrls;
   }

   @NonNull
   @Override
   public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video, parent, false);
      return new VideoViewHolder(view);
   }

   @Override
   public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
      holder.bindVideo(position);
   }

   @Override
   public int getItemCount() {
      return videoUrls.length;
   }

   class VideoViewHolder extends RecyclerView.ViewHolder {

      private VideoView videoView;
      private ProgressBar progressBar;

      VideoViewHolder(@NonNull View itemView) {
         super(itemView);
         videoView = itemView.findViewById(R.id.videoView);
         progressBar = itemView.findViewById(R.id.progressBar);
      }

      void bindVideo(int position) {
         Uri videoUri = Uri.parse(videoUrls[position]);
         videoView.setVideoURI(videoUri);
         MediaController mediaController = new MediaController(itemView.getContext());
         videoView.setMediaController(mediaController);

         videoView.setOnPreparedListener(mp -> {
            progressBar.setVisibility(View.GONE); // Hide progress bar
            mp.start();
            videoView.requestFocus();
         });

         videoView.setOnCompletionListener(mp -> {
            mp.reset();
            // Optional: Play the next video
         });

         videoView.setOnInfoListener((mp, what, extra) -> {
            if (what == MediaPlayer.MEDIA_INFO_BUFFERING_START) {
               progressBar.setVisibility(View.VISIBLE); // Show progress bar during buffering
            } else if (what == MediaPlayer.MEDIA_INFO_BUFFERING_END) {
               progressBar.setVisibility(View.GONE); // Hide progress bar after buffering
            }
            return false;
         });
      }
   }
}