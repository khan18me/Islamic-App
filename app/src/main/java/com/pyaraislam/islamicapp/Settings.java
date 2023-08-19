package com.pyaraislam.islamicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.BuildConfig;
import com.example.islamicapp.R;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        RelativeLayout relativeLayout1 = findViewById(R.id.rating);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName().toString())));


            }
        });

        RelativeLayout relativeLayout2 = findViewById(R.id.share);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                share();

            }
        });

        RelativeLayout relativeLayout3 = findViewById(R.id.report);
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendEmailReport();

            }
        });

        RelativeLayout relativeLayout = findViewById(R.id.moreapps);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.more_app_link))));

            }
        });
    }

    private void sendEmailReport() {
        // Get the report data (You can customize this part to format the email content)
        String emailSubject = getString(R.string.report_email_subject);
        String emailBody = String.format(getString(R.string.report_email_body), getReportDataAsString());

        // Create an Intent to send an email
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"khanmustufa0905@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
        intent.putExtra(Intent.EXTRA_TEXT, emailBody);

        // Verify if there's an email app available on the device
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            // If no email app is available, you can display a message to the user
            Toast.makeText(this, getString(R.string.no_email_app_message), Toast.LENGTH_SHORT).show();
        }
    }

    private Object getReportDataAsString() {
        StringBuilder reportBuilder = new StringBuilder();

        // Assuming reportData is a List of Strings
        String[] reportData = new String[0];
        for (String entry : reportData) {
            reportBuilder.append("- ").append(entry).append("\n");
        }

        return reportBuilder.toString();
    }


    private void share() {
        try {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Online income ideas");
            String shareMessage = "\nLet me recommend you this application\n\n";
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(shareIntent, "choose one"));
        } catch (Exception e) {
            Toast.makeText(Settings.this, "Error occurred", Toast.LENGTH_SHORT)
                    .show();
        }
    }

}
