package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class notifikasiActivity extends AppCompatActivity {

    ImageButton profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_notifikasi);

        // Menginisialisasi tombol
        profileButton = findViewById(R.id.profileButton);


        // Mengatur OnClickListener untuk tombol profil
        klik();
    }

    void klik(){
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(notifikasiActivity.this, profileActivity.class);
                startActivity(intent);
            }
        });
    }
}
