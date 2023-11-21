package com.example.aplikasita;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inisialisasi elemen UI
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        // Mengatur tindakan saat tombol "Login" diklik
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dapatkan nilai dari EditText untuk username dan password
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Lakukan verifikasi login (misalnya, memeriksa username dan password)
                // Jika login berhasil, pindah ke halaman "MainActivity"
                if (verifikasiLogin(username, password)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    // Tampilkan pesan kesalahan jika login gagal
                    // (Anda bisa menambahkan logika pesan kesalahan sesuai kebutuhan)
                }
            }
        });
    }

    // Metode untuk memeriksa login (gantilah ini sesuai dengan kebutuhan Anda)
    private boolean verifikasiLogin(String username, String password) {
        // Implementasi verifikasi login sesuai dengan kebutuhan Anda
        // Ini hanya contoh sederhana, Anda perlu menggantinya sesuai dengan logika aplikasi Anda
        return username.equals("pengguna") && password.equals("password");
    }

    // Metode yang akan dipanggil saat TextView "Register" diklik
    public void onRegisterClick(View view) {
        // Pindah ke halaman pendaftaran (gantilah "RegisterActivity" dengan nama aktivitas registrasi yang sesuai)
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
