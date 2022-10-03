package com.example.hug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    private static int SplashScreenTimeout = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_splash_screen);

        Animation fade = new AlphaAnimation(1, 0);
        fade.setInterpolator(new AccelerateInterpolator());
        fade.setStartOffset(500);
         fade.setDuration(1800);
        ImageView logo = findViewById(R.id.imageView2);

        logo.setAnimation(fade);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, MainActivity.class );
                startActivity(intent);
                finish();

            }
        },SplashScreenTimeout);

    }
}