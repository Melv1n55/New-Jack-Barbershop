package com.example.aplikasita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TimePicker;
import androidx.appcompat.app.AppCompatActivity;

public class TimePickerActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private TimePicker timePicker;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timepicker);

        // Inisialisasi komponen UI
        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        buttonNext = findViewById(R.id.buttonNext);

        // Mengatur tindakan saat tombol "Next" diklik
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan tanggal yang dipilih
                int year = datePicker.getYear();
                int month = datePicker.getMonth();
                int day = datePicker.getDayOfMonth();

                // Mendapatkan waktu yang dipilih
                int hour = timePicker.getCurrentHour();
                int minute = timePicker.getCurrentMinute();

                // Inisialisasi tombol "Back"
                ImageButton buttonBack = findViewById(R.id.buttonBack);

                // Menambahkan tindakan saat tombol "Back" diklik
                buttonBack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Pindah ke halaman BookingActivity
                        Intent intent = new Intent(TimePickerActivity.this, BookingActivity.class);
                        startActivity(intent);
                        finish(); // Menutup aktivitas saat pindah ke MainActivity
                    }
                });

                // Lakukan sesuatu dengan tanggal dan waktu yang dipilih (misalnya, menyimpan ke database)
                // Di sini, Anda dapat mengirim data ini ke halaman selanjutnya atau melakukan tindakan lain yang diperlukan

                // Pindah ke halaman selanjutnya (gantilah "NextActivity" dengan nama aktivitas selanjutnya Anda)
                Intent intent = new Intent(TimePickerActivity.this, BookingSummaryActivity.class);
                startActivity(intent);
            }
        });
    }
}
