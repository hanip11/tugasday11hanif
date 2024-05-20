package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton bioskopButton, tiketButton, notifikasiButton, profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Menginisialisasi tombol
        bioskopButton = findViewById(R.id.bioskopButton);
        tiketButton = findViewById(R.id.tiketButton);
        notifikasiButton = findViewById(R.id.notifikasiButton);
        profileButton = findViewById(R.id.profileButton);

        // Mengatur OnClickListener untuk setiap tombol
        klik();
    }

    void klik(){
        bioskopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, bioskopActivity.class);
                startActivity(intent);
            }
        });

        tiketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, tiketActivity.class);
                startActivity(intent);
            }
        });

        notifikasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, notifikasiActivity.class);
                startActivity(intent);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profileActivity.class);
                startActivity(intent);
            }
        });
    }
}
