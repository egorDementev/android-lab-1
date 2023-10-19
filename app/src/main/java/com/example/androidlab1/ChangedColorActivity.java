package com.example.androidlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class ChangedColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changed_color);

        int selectedColor = getIntent().getIntExtra("selectedColor", Color.WHITE);
        getWindow().getDecorView().setBackgroundColor(selectedColor);
    }

    public void onBackClicked(View view) {
        finish();
    }
}