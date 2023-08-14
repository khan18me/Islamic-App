package com.pyaraislam.islamicapp.dua;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.islamicapp.R;

public class health_more extends AppCompatActivity {
    TextView[] detailsTextArray = new TextView[5];
    LinearLayout[] layoutArray = new LinearLayout[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_more);

        detailsTextArray[0] = findViewById(R.id.health_more_details1);
        detailsTextArray[1] = findViewById(R.id.health_more_details2);
        detailsTextArray[2] = findViewById(R.id.health_more_details3);
        detailsTextArray[3] = findViewById(R.id.health_more_details4);
        detailsTextArray[4] = findViewById(R.id.health_more_details5);


        // ... Repeat for the other detailsText TextViews

        layoutArray[0] = findViewById(R.id.health_more_layout1);
        layoutArray[1] = findViewById(R.id.health_more_layout2);
        layoutArray[2] = findViewById(R.id.health_more_layout3);
        layoutArray[3] = findViewById(R.id.health_more_layout4);
        layoutArray[4] = findViewById(R.id.health_more_layout5);


        // ... Repeat for the other layout containers

        // Enable transition for each layout
        for (LinearLayout layout : layoutArray) {
            layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        }

        // Set click listeners for card views
        for (int i = 0; i < layoutArray.length; i++) {
            final int index = i;
            CardView cardView = (CardView) layoutArray[i].getParent();
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    toggleViewVisibility(detailsTextArray[index], layoutArray[index]);
                }
            });
        }
    }

    private void toggleViewVisibility(TextView detailsText, LinearLayout layout) {
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        int newVisibility = (detailsText.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

        // Hide other detailsText views before showing the selected one
        for (TextView otherDetailsText : detailsTextArray) {
            if (otherDetailsText != detailsText) {
                otherDetailsText.setVisibility(View.GONE);
            }
        }

        detailsText.setVisibility(newVisibility);



    }
}