package com.example.mipt_1_prakt;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    Button btnChangeText;
    Button btnChangeColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        btnChangeText = findViewById(R.id.btnChangeText);
        btnChangeColour = findViewById(R.id.btnChangeColour);
        btnChangeText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                tvMain = (TextView)findViewById(R.id.tvMain);
                tvMain.setText("Hello");
            }
        });
        btnChangeColour.setOnClickListener(new View.OnClickListener() {
            Random rnd = new Random();
            @Override
            public void onClick(View view) {
                tvMain = (TextView)findViewById(R.id.tvMain);
                tvMain.setTextColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

            }
        });

    }




}