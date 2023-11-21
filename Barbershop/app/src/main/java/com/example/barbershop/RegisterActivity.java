package com.example.barbershop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private EditText etFullName;
    private EditText etUsername;
    private EditText etPassword;
    private EditText etConfirmPassword;
    private Button btnRegister;
    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        etFullName = findViewById(R.id.etFullName);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);
        tvLogin = findViewById(R.id.tvLogin);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullName = etFullName.getText().toString();
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                String confirmPassword = etConfirmPassword.getText().toString();

                // Lakukan validasi registrasi di sini
                if (isValidRegistration(fullName, username, password, confirmPassword)) {
                    // Jika registrasi berhasil, tampilkan pesan sukses
                    Toast.makeText(RegisterActivity.this, "Registrasi berhasil!", Toast.LENGTH_SHORT).show();
                } else {
                    // Jika registrasi gagal, tampilkan pesan error
                    Toast.makeText(RegisterActivity.this, "Registrasi gagal. Cek kembali data registrasi.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan navigasi ke halaman login di sini
                Toast.makeText(RegisterActivity.this, "Navigasi ke halaman login", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean isValidRegistration(String fullName, String username, String password, String confirmPassword) {
        // Implementasikan logika validasi registrasi di sini
        // Anda dapat memeriksa kevalidan data registrasi, seperti keunikan username, persyaratan password, dll.
        // Untuk contoh ini, validasi akan selalu mengembalikan true jika semua field tidak kosong dan password sesuai dengan konfirmasi password.
        return !fullName.isEmpty() && !username.isEmpty() && !password.isEmpty() && !confirmPassword.isEmpty() && password.equals(confirmPassword);
    }
}