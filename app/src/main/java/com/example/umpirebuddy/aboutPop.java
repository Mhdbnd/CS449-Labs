package com.example.umpirebuddy;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;


public class aboutPop extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        DisplayMetrics aboutDM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(aboutDM);

        int aboutWidth = aboutDM.widthPixels;
        int aboutHeight = aboutDM.heightPixels;

        getWindow().setLayout(aboutWidth, aboutHeight );

        Button aboutCloseButton = findViewById(R.id.about_exit);
        aboutCloseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
