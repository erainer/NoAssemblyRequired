package com.example.quyo.noassemblyrequired;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button dresserBtn = (Button) findViewById(R.id.dresserBtn);
        final Button bicycleBtn = (Button) findViewById(R.id.bicycleBtn);
        final Button patioBtn = (Button) findViewById(R.id.patioBtn);

        dresserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Dresser.class));
            }
        });

        bicycleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bicycle.class));
            }
        });

        patioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Patio.class));
            }
        });
    }
}
