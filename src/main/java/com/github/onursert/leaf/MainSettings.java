//package com.github.onursert.leaf;
//
//import android.content.Context;
//import android.content.SharedPreferences;
//import android.content.pm.ActivityInfo;
//import android.content.res.Configuration;
//import android.os.Bundle;
//import android.preference.PreferenceManager;
//import android.support.v7.app.AppCompatActivity;
//import android.view.WindowManager;
//
//import java.util.Objects;
//
//public class MainSettings extends AppCompatActivity {
//
//    Context context;
//    SharedPreferences sharedPreferences;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_settings);
//        Objects.requireNonNull(getSupportActionBar()).setTitle("Settings");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        context = getApplicationContext();
//
//        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
//        sharedPreferences.registerOnSharedPreferenceChangeListener(listener);
//        if (sharedPreferences.getBoolean("keep_screen_on", false)) {
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
//        } else {
//            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
//        }
//        if (sharedPreferences.getBoolean("rotation_lock", false)) {
//            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
//            } else {
//                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
//            }
//        } else {
//            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
//        }
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MainSettingsFragment()).commit();
//    }
//
//    //Shared Preferences
//    SharedPreferences.OnSharedPreferenceChangeListener listener = new SharedPreferences.OnSharedPreferenceChangeListener() {
//        @Override
//        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
//            assert key != null;
//            if (key.equals("keep_screen_on")) {
//                if (sharedPreferences.getBoolean("keep_screen_on", false)) {
//                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
//                } else {
//                    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
//                }
//            } else if (key.equals("rotation_lock")) {
//                if (sharedPreferences.getBoolean("rotation_lock", false)) {
//                    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//                        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
//                    } else {
//                        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
//                    }
//                } else {
//                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
//                }
//            }
//        }
//    };
//
//    //On Navigation Up
//    @Override
//    public boolean onSupportNavigateUp() {
//        finish();
//        return true;
//    }
//}
