package com.example.umpirebuddy;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;



public class ballPop extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ball_pop);

        DisplayMetrics strikeDM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(strikeDM);

        int ballWidth = strikeDM.widthPixels;
        int ballHeight = strikeDM.heightPixels;

        getWindow().setLayout(ballWidth,ballHeight);

        Button walkExit = findViewById(R.id.walkClose);
        walkExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}