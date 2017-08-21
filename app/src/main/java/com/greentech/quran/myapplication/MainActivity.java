package com.greentech.quran.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageView spaceshipImage = (ImageView) findViewById(R.id.androoid);
//        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(this, R.anim.anim);
//        spaceshipImage.startAnimation(hyperspaceJumpAnimation);
//        spaceshipImage.setVisibility(View.VISIBLE);
//       TranslateAnimation mAnimation = new TranslateAnimation(
//                TranslateAnimation.ABSOLUTE, 0f,
//                TranslateAnimation.ABSOLUTE, 200f ,
//                TranslateAnimation.RELATIVE_TO_PARENT, 0f,
//                TranslateAnimation.RELATIVE_TO_PARENT, 1.0f);
//        mAnimation.setDuration(10000);
//        mAnimation.setRepeatCount(-1);
//        mAnimation.setRepeatMode(Animation.ABSOLUTE);
//        mAnimation.setInterpolator(new LinearInterpolator());
//        spaceshipImage.setAnimation(mAnimation);

        Button buttonOne = (Button) findViewById(R.id.move);
        buttonOne.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //Do stuff here
                Intent intent = new Intent(MainActivity.this, OverlayShowingService.class);
                startService(intent);
                stopService(intent);
            }
        });
    }
}
