package com.example.thetiffinbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        logo=findViewById(R.id.appLogo);
        Animation myAnim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.mytransition);
        logo.startAnimation(myAnim);
        final Intent i=new Intent(MainActivity.this,IntroActivity.class);

        Thread timer=new Thread(){
            public void run (){
                try {
                    sleep(7000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }

            }

        };
        timer.start();

    }
}