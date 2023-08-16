package com.pyaraislam.islamicapp.reels;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicapp.R;

public class reels extends AppCompatActivity {

    private RecyclerView recyclerView;

    private String[] videoUrls = {
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2FSnapinsta.app_video_10000000_598167212389099_7399323102661442925_n.mp4?alt=media&token=4efb8a0d-76e7-46a3-8109-642d47dee8a5",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2FSnapinsta.app_video_10000000_598167212389099_7399323102661442925_n.mp4?alt=media&token=4efb8a0d-76e7-46a3-8109-642d47dee8a5",
            "https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2FSnapinsta.app_video_10000000_598167212389099_7399323102661442925_n.mp4?alt=media&token=4efb8a0d-76e7-46a3-8109-642d47dee8a5"// Add more video URLs
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reels);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new VideoAdapter(videoUrls));
    }
}

 /*videoUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2FSnapinsta.app_video_10000000_598167212389099_7399323102661442925_n.mp4?alt=media&token=4efb8a0d-76e7-46a3-8109-642d47dee8a5");
         videoUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2FSnapinsta.app_video_10000000_598167212389099_7399323102661442925_n.mp4?alt=media&token=4efb8a0d-76e7-46a3-8109-642d47dee8a5");
         // ... add all 20 URLs here
         videoUrls.add("https://firebasestorage.googleapis.com/v0/b/islamicapp-802.appspot.com/o/reels%2FSnapinsta.app_video_10000000_598167212389099_7399323102661442925_n.mp4?alt=media&token=4efb8a0d-76e7-46a3-8109-642d47dee8a5"); */
