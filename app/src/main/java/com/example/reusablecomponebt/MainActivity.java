package com.example.reusablecomponebt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout layoutContainer = findViewById(R.id.layoutContainer);
        layoutContainer.addView(new Itemlayout(this));
        layoutContainer.addView(new Itemlayout(this));
        layoutContainer.addView(new Itemlayout(this));

    }
}