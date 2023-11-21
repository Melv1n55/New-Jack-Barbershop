package com.example.aplikasita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton buttonServices;
    private ImageButton buttonAppointment;
    private ImageButton buttonProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi tombol UI
        buttonServices = findViewById(R.id.buttonServices);
        buttonAppointment = findViewById(R.id.buttonAppointment);
        buttonProfile = findViewById(R.id.buttonProfile);

        // Mengatur tindakan saat tombol "Services" diklik
        buttonServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman "Services" (gantilah "ServicesActivity" dengan nama aktivitas Services Anda)
                Intent intent = new Intent(MainActivity.this, ServicesActivity.class);
                startActivity(intent);
            }
        });

        // Mengatur tindakan saat tombol "Appointment" diklik
        buttonAppointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman "Appointment" (gantilah "AppointmentActivity" dengan nama aktivitas Appointment Anda)
                Intent intent = new Intent(MainActivity.this, AppointmentActivity.class);
                startActivity(intent);
            }
        });

        // Mengatur tindakan saat tombol "Profile" diklik
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman "Profile" (gantilah "ProfileActivity" dengan nama aktivitas Profile Anda)
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
