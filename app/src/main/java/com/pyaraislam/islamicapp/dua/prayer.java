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

public class prayer extends AppCompatActivity {

    TextView[] detailsTextArray = new TextView[7];
    LinearLayout[] layoutArray = new LinearLayout[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer);

        detailsTextArray[0] = findViewById(R.id.prayer_details1);
        detailsTextArray[1] = findViewById(R.id.prayer_details2);
        detailsTextArray[2] = findViewById(R.id.prayer_details3);
        detailsTextArray[3] = findViewById(R.id.prayer_details4);
        detailsTextArray[4] = findViewById(R.id.prayer_details5);
        detailsTextArray[5] = findViewById(R.id.prayer_details6);
        detailsTextArray[6] = findViewById(R.id.prayer_details7);


        layoutArray[0] = findViewById(R.id.prayer_layout1);
        layoutArray[1] = findViewById(R.id.prayer_layout2);
        layoutArray[2] = findViewById(R.id.prayer_layout3);
        layoutArray[3] = findViewById(R.id.prayer_layout4);
        layoutArray[4] = findViewById(R.id.prayer_layout5);
        layoutArray[5] = findViewById(R.id.prayer_layout6);
        layoutArray[6] = findViewById(R.id.prayer_layout7);


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