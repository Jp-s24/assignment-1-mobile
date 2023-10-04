package com.example.mobile_assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the Button by its ID
        Button button = findViewById(R.id.buttonN);
        // Set up an OnClickListener for the Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start the Calculator activity
                Intent intent = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent);
            }
        });
    }
}
