package org.tensorflow.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.pm.PackageManager;


public class MainActivity extends Activity {
    private Button button3;
    private Button button4;
    private Button button5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Button bClock = (Button) findViewById(R.id.button3);  // findViewById(R.id."aplya level 1 button cha buttonid");
        bClock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_MAIN);
                PackageManager managerOpenLevel1 = getPackageManager();
                i = managerOpenLevel1.getLaunchIntentForPackage("com.ComAR.ABCAR");
                //"com.example.." ithe fakta unity app cha package cha naav enter karaicha quotes madhe .
                //package name kd la mahiti ahe , unity3d madhe disel tyala
                i.addCategory(Intent.CATEGORY_LAUNCHER);
                startActivity(i);
            }

        });*/
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_MAIN);
                PackageManager managerOpenLevel1 = getPackageManager();
                i = managerOpenLevel1.getLaunchIntentForPackage("com.ComAR.ABCAR");
                //"com.example.." ithe fakta unity app cha package cha naav enter karaicha quotes madhe .
                //package name kd la mahiti ahe , unity3d madhe disel tyala
                i.addCategory(Intent.CATEGORY_LAUNCHER);
                startActivity(i);
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain2Activity();
            }
        });


        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassifierActivity2();
            }
        });
    }

    public void openMain2Activity() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void openClassifierActivity2() {
        Intent intent = new Intent(this, ClassifierActivity2.class);
        startActivity(intent);
    }

   /* public void openUnityPlayerNativeActivity() {
        Intent intent = new Intent(this,UnityPlayerActivity.class);
        startActivity(intent);
    }*/

}