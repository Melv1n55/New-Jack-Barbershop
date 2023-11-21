package com.example.aplikasita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Inisialisasi elemen UI
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        // Mengatur tindakan saat tombol "Register" diklik
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dapatkan nilai dari EditText untuk email, username, dan password
                String email = editTextEmail.getText().toString();
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Lakukan proses registrasi (misalnya, menyimpan informasi pengguna ke database)
                // Setelah registrasi berhasil, pindah ke halaman "LoginActivity"
                if (prosesRegistrasi(email, username, password)) {
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else {
                    // Tampilkan pesan kesalahan jika registrasi gagal
                    // (Anda bisa menambahkan logika pesan kesalahan sesuai kebutuhan)
                }
            }
        });
    }

    // Metode untuk memproses registrasi (gantilah ini sesuai dengan kebutuhan Anda)
    private boolean prosesRegistrasi(String email, String username, String password) {
        // Implementasi proses registrasi sesuai dengan kebutuhan Anda
        // Ini hanya contoh sederhana, Anda perlu menggantinya sesuai dengan logika aplikasi Anda
        return true; // Mengembalikan true jika registrasi berhasil
    }
}
