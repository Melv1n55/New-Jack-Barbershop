package com.example.aplikasita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class BookingSummaryActivity extends AppCompatActivity {

    private TextView textViewService;
    private TextView textViewDateTime;
    private Button buttonConfirmBooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookingsummary);

        // Inisialisasi komponen UI
        textViewService = findViewById(R.id.textViewService);
        textViewDateTime = findViewById(R.id.textViewDateTime);
        buttonConfirmBooking = findViewById(R.id.buttonConfirmBooking);

        // Mendapatkan informasi pemesanan dari aktivitas sebelumnya (BookingActivity)
        Intent intent = getIntent();
        String selectedService = intent.getStringExtra("selectedService");
        String selectedDateTime = intent.getStringExtra("selectedDateTime");

        // Menampilkan informasi pemesanan
        textViewService.setText("Selected Service: " + selectedService);
        textViewDateTime.setText("Date and Time: " + selectedDateTime);

        // Inisialisasi tombol "Back"
        ImageButton buttonBack = findViewById(R.id.buttonBack);

        // Menambahkan tindakan saat tombol "Back" diklik
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pindah ke halaman ServicesActivity
                Intent intent = new Intent(BookingSummaryActivity.this, TimePickerActivity.class);
                startActivity(intent);
                finish(); // Menutup aktivitas saat pindah ke ServicesActivity
            }
        });

        // Mengatur tindakan saat tombol "Confirm Booking" diklik
        buttonConfirmBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lakukan tindakan konfirmasi pemesanan di sini
                // Misalnya, simpan pemesanan ke database atau lakukan proses lain yang diperlukan

                // Setelah pemesanan dikonfirmasi, Anda dapat pindah ke halaman lain atau mengambil tindakan lain yang sesuai
                Intent confirmationIntent = new Intent(BookingSummaryActivity.this, AppointmentActivity.class);
                startActivity(confirmationIntent);
            }
        });
    }
}
