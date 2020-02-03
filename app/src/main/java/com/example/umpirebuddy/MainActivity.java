package com.example.umpirebuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int sCounter = 0;
    private int bCounter = 0;
    Button strike, ball, reset, exit;
    TextView numstrike, numball;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strike = (Button) findViewById(R.id.Strikes);
        numstrike = (TextView) findViewById(R.id.strikeCount);

        strike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sCounter++;
                numstrike.setText(Integer.toString(sCounter));
            }
        });

        ball = (Button) findViewById(R.id.Balls);
        numball = (TextView) findViewById(R.id.ballCount);

        ball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bCounter++;
                numball.setText(Integer.toString(bCounter));
            }
        });

        reset = (Button) findViewById(R.id.Reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sCounter = 0;
                bCounter = 0;
                numstrike.setText(Integer.toString(sCounter));
                numball.setText(Integer.toString(bCounter));
            }
        });

        exit = (Button) findViewById(R.id.Exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }


}
