package com.example.islamicapp;

import android.Manifest;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.islamicapp.dua.MainActivityDua;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static final String THEME_KEY = "Theme";
    private boolean checkPermission = false;
    ArrayList<String> NotifMessages = new ArrayList<>();
    ArrayList<String> NotifSalatMessages = new ArrayList<>();

    TextView mFajr,mDuhur,mAsr,mMaghrib,mIsha,mCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         NotifMessages();

        SharedPreferences preff = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = preff.getBoolean("firstStartDialog", true);
        if (firstStart) showStartDialog();

        if(NetworkConnectivity.isNetworkStatusAvailable(getApplicationContext())) {
            Toast.makeText(getApplicationContext(), getString(R.string.internetfound), Toast.LENGTH_SHORT).show();
            new GetPrayerTimes().execute();
        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.internetlost), Toast.LENGTH_SHORT).show();
            LoadPreviousSalatData();
        }











        RelativeLayout relativeLayout1 = findViewById(R.id.tasbeeh);
        RelativeLayout relativeLayout2 = findViewById(R.id.quran);
        RelativeLayout relativeLayout3 = findViewById(R.id.hadees);
        RelativeLayout relativeLayout4 = findViewById(R.id.dua);
        RelativeLayout relativeLayout5 = findViewById(R.id.qibla_direction);
        RelativeLayout relativeLayout6 = findViewById(R.id.namaz);
        RelativeLayout relativeLayout7 = findViewById(R.id.wallpaper);
        RelativeLayout relativeLayout8 = findViewById(R.id.waqiah);
        relativeLayout1.setOnClickListener(onClickListener);
        relativeLayout2.setOnClickListener(onClickListener);
        relativeLayout3.setOnClickListener(onClickListener);
        relativeLayout4.setOnClickListener(onClickListener);
        relativeLayout5.setOnClickListener(onClickListener);
        relativeLayout6.setOnClickListener(onClickListener);
        relativeLayout7.setOnClickListener(onClickListener);
        relativeLayout8.setOnClickListener(onClickListener);
        validatePermision();
    }

    private void NotifMessages() {
        NotifMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.thought1)+"“");
        NotifMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.thought2)+"“");
        NotifMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.thought3)+"“");
        NotifMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.thought4)+"“");
        NotifMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.thought5)+"“");
        NotifMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.thought6)+"“");
        NotifMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.thought7)+"“");
        NotifMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.thought8)+"“");
        NotifMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.thought9)+"“");
        NotifMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.thought10)+"“");
        NotifMessages.add(getString(R.string.AdkarExtra1));
        NotifMessages.add(getString(R.string.AdkarExtra2));
        NotifMessages.add(getString(R.string.AdkarExtra3));
        NotifMessages.add(getString(R.string.AdkarExtra4));
        NotifMessages.add(getString(R.string.AdkarExtra5));
        NotifMessages.add(getString(R.string.AdkarExtra6));
        NotifSalatMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.SalatThought1)+"“");
        NotifSalatMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.SalatThought2)+"“");
        NotifSalatMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.SalatThought3)+"“");
        NotifSalatMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.SalatThought4)+"“");
        NotifSalatMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.SalatThought5)+"“");
        NotifSalatMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.SalatThought6)+"“");
        NotifSalatMessages.add(getString(R.string.menu_fadlGod1)+" ”"+getString(R.string.SalatThought7)+"“");
        NotifSalatMessages.add(getString(R.string.SalatExtra1));
        NotifSalatMessages.add(getString(R.string.SalatExtra2));
        NotifSalatMessages.add(getString(R.string.SalatExtra3));
        NotifSalatMessages.add(getString(R.string.SalatExtra4));
        NotifSalatMessages.add(getString(R.string.SalatExtra5));
    }
    public  int GetRandom(){
        Random rng = new Random();
        int random = rng.nextInt(1000000);
        return  random;
    }
    public void scheduleNotification(Context context,int type, int hh, int mm ){
        Intent broadcastIntent = new Intent("android.media.action.DISPLAY_NOTIFICATION");
        broadcastIntent.addCategory("android.intent.category.DEFAULT");
        broadcastIntent.putStringArrayListExtra("ArrayMessages",NotifMessages);
        broadcastIntent.putStringArrayListExtra("ArraySalatMessages",NotifSalatMessages);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Calendar cal = Calendar.getInstance();
        String HH =String.format("%02d", hh);
        String MM=String.format("%02d", mm);
        switch (type) {

            case 1: { //Fajr
                String message = getString(R.string.itsprayertime)+" "+getString(R.string.fajr)+" "+HH+":"+MM ;
                broadcastIntent.putExtra("NotifTitle1",  message);
                broadcastIntent.putExtra("NotifId1",type);
                broadcastIntent.putExtra("NotifTimeMM1",mm);
                broadcastIntent.putExtra("NotifTimeHH1",hh);
                PendingIntent broadcast1 = PendingIntent.getBroadcast(this, 1, broadcastIntent ,PendingIntent.FLAG_UPDATE_CURRENT);
                cal.set(Calendar.HOUR_OF_DAY, hh);
                cal.set(Calendar.MINUTE,mm);
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), AlarmManager.INTERVAL_DAY, broadcast1);
                break;
            }
            case 2: { //Dhuhr
                String message = getString(R.string.itsprayertime)+" "+getString(R.string.dohr)+" "+HH+":"+MM ;
                broadcastIntent.putExtra("NotifTitle2",  message);
                broadcastIntent.putExtra("NotifId2",type);
                broadcastIntent.putExtra("NotifTimeMM2",mm);
                broadcastIntent.putExtra("NotifTimeHH2",hh);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this,2, broadcastIntent ,PendingIntent.FLAG_UPDATE_CURRENT);
                cal.set(Calendar.HOUR_OF_DAY, hh);
                cal.set(Calendar.MINUTE,mm);
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), AlarmManager.INTERVAL_DAY, broadcast2);
                break;
            }
            case 3: { //Asr
                String message = getString(R.string.itsprayertime)+" "+getString(R.string.asr)+" "+HH+":"+MM  ;
                broadcastIntent.putExtra("NotifTitle3",  message);
                broadcastIntent.putExtra("NotifId3",type);
                broadcastIntent.putExtra("NotifTimeMM3",mm);
                broadcastIntent.putExtra("NotifTimeHH3",hh);
                PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 3, broadcastIntent ,PendingIntent.FLAG_UPDATE_CURRENT);
                cal.set(Calendar.HOUR_OF_DAY, hh);
                cal.set(Calendar.MINUTE,mm);
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), AlarmManager.INTERVAL_DAY, broadcast3);
                break;
            }
            case 4: { //Maghrib
                String message = getString(R.string.itsprayertime)+" "+getString(R.string.maghrib)+" "+HH+":"+MM ;
                broadcastIntent.putExtra("NotifTitle4",  message);
                broadcastIntent.putExtra("NotifId4",type);
                broadcastIntent.putExtra("NotifTimeMM4",mm);
                broadcastIntent.putExtra("NotifTimeHH4",hh);
                PendingIntent broadcast4 = PendingIntent.getBroadcast(this,4, broadcastIntent ,PendingIntent.FLAG_UPDATE_CURRENT);
                cal.set(Calendar.HOUR_OF_DAY, hh);
                cal.set(Calendar.MINUTE,mm);
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), AlarmManager.INTERVAL_DAY, broadcast4);
                break;
            }
            case 5: { //Isha
                String message = getString(R.string.itsprayertime)+" "+getString(R.string.isha)+" "+HH+":"+MM ;
                broadcastIntent.putExtra("NotifTitle5",  message);
                broadcastIntent.putExtra("NotifId5",type);
                broadcastIntent.putExtra("NotifTimeMM5",mm);
                broadcastIntent.putExtra("NotifTimeHH5",hh);
                PendingIntent broadcast5 = PendingIntent.getBroadcast(this, 5, broadcastIntent , PendingIntent.FLAG_UPDATE_CURRENT);
                cal.set(Calendar.HOUR_OF_DAY, hh);
                cal.set(Calendar.MINUTE,mm);
                alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), AlarmManager.INTERVAL_DAY, broadcast5);
                break;
            }

        }
    }
    private long backPressedTime;
    private Toast backToast;

    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), getString(R.string.clickbackagaintoexit), Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }



    private void showStartDialog() {
        new AlertDialog.Builder(this,R.style.AlertDialogCustom)
                .setTitle(getString(R.string.hello))
                .setMessage(getString(R.string.firstalertdialogmsg))
                .setPositiveButton(getString(R.string.ok), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();
        SharedPreferences preff = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = preff.edit();
        editor.putBoolean("firstStartDialog", false);
        editor.apply();
    }


    private void LoadPreviousSalatData() {
        SharedPreferences salatpref = getSharedPreferences("lastprayertimes", MODE_PRIVATE);
        TextView mxFajr,mxDuhur,mxAsr,mxMaghrib,mxIsha,mxCity;
        mxFajr=findViewById(R.id.fajr);
        mxDuhur=findViewById(R.id.duhur);
        mxAsr=findViewById(R.id.asr);
        mxMaghrib=findViewById(R.id.maghrib);
        mxIsha=findViewById(R.id.isha);
        mxCity=findViewById(R.id.city);
        String GETPrayerCity =salatpref.getString("city",getString(R.string.city));
        String GETfajr = salatpref.getString("fajr","00:00");
        String GETduhur = salatpref.getString("duhur","00:00");
        String GETasr = salatpref.getString("asr","00:00");
        String GETmaghrib = salatpref.getString("maghrib","00:00");
        String GETisha = salatpref.getString("isha","00:00");

        mxCity.setText(GETPrayerCity);
        mxFajr.setText(GETfajr);
        mxDuhur.setText(GETduhur);
        mxAsr.setText(GETasr);
        mxMaghrib.setText(GETmaghrib);
        mxIsha.setText(GETisha);
    }
    private class GetPrayerTimes extends AsyncTask<Void, Void, Void> {
        SharedPreferences salatpref = getSharedPreferences("lastprayertimes", MODE_PRIVATE);
        String GETPrayerCity =salatpref.getString("city","Rabat");
        String GETCountry =salatpref.getString("country","Morocco");
        int fajroff =salatpref.getInt("fajroffset",0);
        int dhuhroff =salatpref.getInt("dhuhroffset",0);
        int asroff =salatpref.getInt("asroffset",0);
        int maghriboff =salatpref.getInt("maghriboffset",0);
        int ishaoff =salatpref.getInt("ishaoffset",0);
        String fajr,duhur,asr,maghrib,isha;
        Boolean Passed=false;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //Toast.makeText(MainActivity.this,getString(R.string.loadingprayertimes),Toast.LENGTH_LONG).show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            HttpHandler sh = new HttpHandler();
            // Making a request to url and getting response
            //String url = "https://api.pray.zone/v2/times/today.json?city="+GETPrayerCity;
            String offsets = "&tune=0,"+(fajroff-6)+",0,"+(dhuhroff+5)+","+asroff+","+(maghriboff+5)+",0,"+ishaoff+",0" ;
            String url ="http://api.aladhan.com/v1/timingsByCity?city="+GETPrayerCity+"&country="+GETCountry+"&method=3"+offsets;
            String jsonStr = sh.makeServiceCall(url);
            //Log.e("TAG", "Response from url: " + jsonStr);
            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);
                    JSONObject data = jsonObj.getJSONObject("data");
                    JSONObject prayertimes = data.getJSONObject("timings");
                    fajr = prayertimes.getString("Fajr");
                    duhur = prayertimes.getString("Dhuhr");
                    asr = prayertimes.getString("Asr");
                    maghrib = prayertimes.getString("Maghrib");
                    isha = prayertimes.getString("Isha");
                    Passed =true;
                } catch (final JSONException e) {
                    Log.e("TAG", "Json parsing error: " + e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(), getString(R.string.errorloadprayertimes), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            } else {
                Log.e("TAG", "Couldn't get json from server.");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(), getString(R.string.errorloadprayertimes), Toast.LENGTH_LONG).show();
                    }
                });
            }
            return null;
        }
        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            Toast.makeText(getApplicationContext(), getString(R.string.prayertimesloaded), Toast.LENGTH_LONG).show();
            SharedPreferences salatpref = getSharedPreferences("lastprayertimes", MODE_PRIVATE);
            SharedPreferences.Editor editor = salatpref.edit();
            // editor.putString("city", GETPrayerCity);
            editor.putString("fajr",fajr);
            editor.putString("duhur",duhur);
            editor.putString("asr",asr);
            editor.putString("maghrib",maghrib);
            editor.putString("isha",isha);
            editor.apply();

            mFajr=findViewById(R.id.fajr);
            mDuhur=findViewById(R.id.duhur);
            mAsr=findViewById(R.id.asr);
            mMaghrib=findViewById(R.id.maghrib);
            mIsha=findViewById(R.id.isha);
            mCity=findViewById(R.id.city);
            mCity.setText(GETPrayerCity);
            mFajr.setText(fajr);
            mDuhur.setText(duhur);
            mAsr.setText(asr);
            mMaghrib.setText(maghrib);
            mIsha.setText(isha);
            if (Passed) {
                String[] time1 = fajr.split(":");
                int hh1 = Integer.parseInt(time1[0].trim());
                int mm1 = Integer.parseInt(time1[1].trim());
                String[] time2 = duhur.split(":");
                int hh2 = Integer.parseInt(time2[0].trim());
                int mm2 = Integer.parseInt(time2[1].trim());
                String[] time3 = asr.split(":");
                int hh3 = Integer.parseInt(time3[0].trim());
                int mm3 = Integer.parseInt(time3[1].trim());
                String[] time4 = maghrib.split(":");
                int hh4 = Integer.parseInt(time4[0].trim());
                int mm4 = Integer.parseInt(time4[1].trim());
                String[] time5 = isha.split(":");
                int hh5 = Integer.parseInt(time5[0].trim());
                int mm5 = Integer.parseInt(time5[1].trim());

              /*  scheduleNotification(getApplicationContext(), 10, hh1, mm1);
                scheduleNotification(getApplicationContext(), 11, hh3, mm3);
                scheduleNotification(getApplicationContext(), 1, hh1, mm1);
                scheduleNotification(getApplicationContext(), 2, hh2, mm2);
                scheduleNotification(getApplicationContext(), 3, hh3, mm3);
                scheduleNotification(getApplicationContext(), 4, hh4, mm4);
                scheduleNotification(getApplicationContext(), 5, hh5, mm5); */
            }
        }
    }























    View.OnClickListener onClickListener = view -> {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.tasbeeh:
                intent = new Intent(MainActivity.this, Tasbih.class);
                break;
            case R.id.quran:
                intent = new Intent(MainActivity.this, Quran.class);
                break;
            case R.id.hadees:
                intent = new Intent(MainActivity.this, Quran.class);
                break;
            case R.id.dua:
                intent = new Intent(MainActivity.this, MainActivityDua.class);
                break;
            case R.id.qibla_direction:
                intent = new Intent(MainActivity.this, QiblaFinder.class);
                break;
            case R.id.namaz:
                intent = new Intent(MainActivity.this, Namaz.class);
                break;
            case R.id.wallpaper:
                intent = new Intent(MainActivity.this, Wallpaper.class);
                break;
            case R.id.waqiah:
                intent = new Intent(MainActivity.this, Namaz.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }

    };
    public void SalatSettings(View v){
        Intent intent= new Intent(this,SalatSettings.class);
        startActivity(intent);
    }



    private boolean validatePermision(){

        Dexter.withActivity(MainActivity.this)
                .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse response) {
                        checkPermission = true;
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse response) {
                        checkPermission = false;
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                        token.continuePermissionRequest();
                    }
                }).check();

        return checkPermission;
    }



}


   /* RelativeLayout relativeLayout1 = findViewById(R.id.exercise);
        relativeLayout1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, levels.class);
        startActivity(intent);

        }
        });

        RelativeLayout relativeLayout2 = findViewById(R.id.shop);
        relativeLayout2.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, shop.class);
        startActivity(intent);

        }
        });

        RelativeLayout relativeLayout3 = findViewById(R.id.diet);
        relativeLayout3.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, diet.class);
        startActivity(intent);

        }
        });

        RelativeLayout relativeLayout4 = findViewById(R.id.reminder);
        relativeLayout4.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, reminder.class);
        startActivity(intent);

        }
        });

        RelativeLayout relativeLayout5 = findViewById(R.id.settings);
        relativeLayout5.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, settings.class);
        startActivity(intent);
        }
        });

        RelativeLayout relativeLayout6 = findViewById(R.id.music);
        relativeLayout6.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        openMusicApp();
        }
        });



        } */
