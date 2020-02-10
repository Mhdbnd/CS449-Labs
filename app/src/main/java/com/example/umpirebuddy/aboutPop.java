package com.example.umpirebuddy;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import androidx.annotation.Nullable;

class aboutPop extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutpop);

        DisplayMetrics aboutDM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(aboutDM);

        int aboutWidth = aboutDM.widthPixels;
        int aboutHeight = aboutDM.heightPixels;

        getWindow().setLayout(aboutWidth, aboutHeight);

    }
}
