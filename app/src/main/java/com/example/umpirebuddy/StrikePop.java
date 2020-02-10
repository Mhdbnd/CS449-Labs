package com.example.umpirebuddy;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;




public class StrikePop extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.strike_out);

        DisplayMetrics strikeDM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(strikeDM);

        int strikeWidth = strikeDM.widthPixels;
        int strikeHeight = strikeDM.heightPixels;

        getWindow().setLayout(strikeWidth,strikeHeight);

        Button strikeExit = findViewById(R.id.strikeClose);
        strikeExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
