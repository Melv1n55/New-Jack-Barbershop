package com.example.aplikasita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class AppointmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        // Inisialisasi tombol "Back"
        ImageButton buttonBack = findViewById(R.id.buttonBack);

        // Menambahkan tindakan saat tombol "Back" diklik
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pindah ke halaman MainActivity
                Intent intent = new Intent(AppointmentActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup aktivitas saat pindah ke MainActivity
            }
        });
    }
}
