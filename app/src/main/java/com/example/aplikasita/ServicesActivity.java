package com.example.aplikasita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ServicesActivity extends AppCompatActivity {

    private Button buttonNormalCut;
    private Button buttonPremiumCut;
    private Button buttonHairColoring;
    private Button buttonShaving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        // Inisialisasi tombol UI
        buttonNormalCut = findViewById(R.id.buttonNormalCut);
        buttonPremiumCut = findViewById(R.id.buttonPremiumCut);
        buttonHairColoring = findViewById(R.id.buttonHairColoring);
        buttonShaving = findViewById(R.id.buttonShaving);

        // Inisialisasi tombol "Back"
        ImageButton buttonBack = findViewById(R.id.buttonBack);

        // Menambahkan tindakan saat tombol "Back" diklik
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pindah ke halaman MainActivity
                Intent intent = new Intent(ServicesActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup aktivitas saat pindah ke MainActivity
            }
        });

        // Mengatur tindakan saat tombol "Booking" di Normal Cut diklik
        buttonNormalCut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman pemesanan dengan mengirim data layanan yang dipilih (Normal Cut)
                Intent intent = new Intent(ServicesActivity.this, BookingActivity.class);
                intent.putExtra("service", "Normal Cut");
                startActivity(intent);
            }
        });

        // Mengatur tindakan saat tombol "Booking" di Shaving diklik
        buttonShaving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman pemesanan dengan mengirim data layanan yang dipilih (Shaving)
                Intent intent = new Intent(ServicesActivity.this, BookingActivity.class);
                intent.putExtra("service", "Shaving");
                startActivity(intent);
            }
        });

        // Mengatur tindakan saat tombol "Booking" di Premium Cut diklik
        buttonPremiumCut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman pemesanan dengan mengirim data layanan yang dipilih (Premium Cut)
                Intent intent = new Intent(ServicesActivity.this, BookingActivity.class);
                intent.putExtra("service", "Premium Cut");
                startActivity(intent);
            }
        });

        // Mengatur tindakan saat tombol "Booking" di Hair Coloring diklik
        buttonHairColoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman pemesanan dengan mengirim data layanan yang dipilih (Hair Coloring)
                Intent intent = new Intent(ServicesActivity.this, BookingActivity.class);
                intent.putExtra("service", "Hair Coloring");
                startActivity(intent);
            }
        });
    }
}
