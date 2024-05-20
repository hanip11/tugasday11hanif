package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class tiketActivity extends AppCompatActivity {

    ImageButton notifikasiButton, profileButton,homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tiket);

        // Menginisialisasi tombol
        notifikasiButton = findViewById(R.id.notifikasiButton);
        profileButton = findViewById(R.id.profileButton);
        homeButton = findViewById(R.id.homeButton);

        // Mengatur OnClickListener untuk setiap tombol
        klik();
    }

    void klik(){
        notifikasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tiketActivity.this, notifikasiActivity.class);
                startActivity(intent);
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tiketActivity.this, profileActivity.class);
                startActivity(intent);
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeButton = new Intent(tiketActivity.this, MainActivity.class);
                startActivity(intentHomeButton);
            }
        });
    }
}
