package com.example.tugasday11;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat.Type;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat.Type;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsCompat.Type;

public class bioskopActivity extends AppCompatActivity {

    ImageButton bioskopButton, tiketButton, notifikasiButton, profileButton, homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bioskop);

        // Inisialisasi ImageButtons
        bioskopButton = findViewById(R.id.bioskopButton);
        tiketButton = findViewById(R.id.tiketButton);
        notifikasiButton = findViewById(R.id.notifikasiButton);
        profileButton = findViewById(R.id.profileButton);
        homeButton = findViewById(R.id.homeButton); // Pastikan ID ini benar

        // Atur padding untuk pageButton
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.homeButton), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Panggil metode untuk mengatur klik listener
        setupButtonClickListeners();
    }

    void setupButtonClickListeners() {
        // Atur listener untuk bubbleButton
        bioskopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChatButton = new Intent(bioskopActivity.this, bioskopActivity.class);
                startActivity(intentChatButton);
            }
        });

        // Atur listener untuk phoneButton
        tiketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPhoneButton = new Intent(bioskopActivity.this, tiketActivity.class);
                startActivity(intentPhoneButton);
            }
        });

        // Atur listener untuk voomButton
        notifikasiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPlayButton = new Intent(bioskopActivity.this, notifikasiActivity.class);
                startActivity(intentPlayButton);
            }
        });

        // Atur listener untuk profileButton
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSettingsButton = new Intent(bioskopActivity.this, profileActivity.class);
                startActivity(intentSettingsButton);
            }
        });

        // Atur listener untuk homeButton
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHomeButton = new Intent(bioskopActivity.this, MainActivity.class);
                startActivity(intentHomeButton);
            }
        });
    }
}
