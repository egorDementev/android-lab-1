package com.example.androidlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mSpinner = findViewById(R.id.colorSpinner);

        List<String> mList = Arrays.asList("Red", "Green", "Blue", "White", "Pink", "Yellow");

        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<>(this, R.layout.spinner_list, mList);
        mArrayAdapter.setDropDownViewResource(R.layout.spinner_list);

        mSpinner.setAdapter(mArrayAdapter);
    }

    public void onChangeColorClicked(View view) {
        Spinner colorSpinner = findViewById(R.id.colorSpinner);
        String selectedColor = colorSpinner.getSelectedItem().toString();
        int color = getColorByName(selectedColor);

        Intent intent = new Intent(this, ChangedColorActivity.class);
        intent.putExtra("selectedColor", color);
        startActivity(intent);
    }

    public int getColorByName(String colorName) {
        switch (colorName) {
            case "Red":
                return Color.RED;
            case "Green":
                return Color.GREEN;
            case "Blue":
                return Color.BLUE;
            case "White":
                return Color.WHITE;
            case "Pink":
                return Color.MAGENTA;
            case "Yellow":
                return Color.YELLOW;
            default:
                return Color.BLACK;
        }
    }
}