package com.example.week2app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final TextView display = findViewById(R.id.display);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter++;
                // Code here executes on main thread after user presses button
                display.setText(Integer.toString(counter));

            }
        });
    }
}