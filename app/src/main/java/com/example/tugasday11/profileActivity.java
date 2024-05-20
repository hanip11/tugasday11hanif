package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class profileActivity extends AppCompatActivity {

    ImageButton profileButton; // Anda mungkin ingin mengubah namanya

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        // Menginisialisasi tombol
        profileButton = findViewById(R.id.profileButton);

        // Mengatur OnClickListener untuk tombol profil (jika diperlukan)
        // Karena tombol ini merujuk ke activity yang sama, Anda mungkin tidak perlu OnClickListener di sini
        // Namun, jika ada perubahan di kemudian hari, Anda dapat menambahkannya di sini

    }
}
