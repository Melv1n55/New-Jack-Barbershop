package com.example.aplikasita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Inisialisasi tombol "Back"
        ImageButton buttonBack = findViewById(R.id.buttonBack);

        // Menambahkan tindakan saat tombol "Back" diklik
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Kembali ke halaman sebelumnya
                onBackPressed();
            }
        });

        // Inisialisasi tombol "Logout"
        Button buttonLogout = findViewById(R.id.buttonLogout);

        // Menambahkan tindakan saat tombol "Logout" diklik
        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lakukan tindakan logout, misalnya, kembali ke halaman awal
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup halaman profil setelah logout
            }
        });
    }
}
