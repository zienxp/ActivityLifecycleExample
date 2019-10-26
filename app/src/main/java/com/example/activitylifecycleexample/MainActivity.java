package com.example.activitylifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showlog("onCreate Finish .. ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showlog("onStart Finish");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showlog("onResume Finish");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showlog("onPause Finish");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showlog("onStop Finish");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showlog("onRestart Finish");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showlog("onDestroy Finish");
    }

    public void startAnotherActivity(View view) {

        startActivity(new Intent(this,SecondActivity.class));

    }

    public void finishActivity(View view) {

        finish(); //finish activity manually

    }

    public void showlog(String message){

        Log.d("LifeCycle Test",message);
    }
}
