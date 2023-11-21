package com.example.barbershop;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        etUsername = etUsername.findViewById(R.id.etUsername);
        etPassword = etPassword.findViewById(R.id.etPassword);
        btnLogin = btnLogin.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                // Lakukan validasi login di sini
                if (isValidLogin(username, password)) {
                    // Jika login berhasil, tampilkan pesan sukses
                    Toast.makeText(LoginActivity.this, "Login berhasil!", Toast.LENGTH_SHORT).show();
                } else {
                    // Jika login gagal, tampilkan pesan error
                    Toast.makeText(LoginActivity.this, "Login gagal. Cek kembali username dan password.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private boolean isValidLogin(String username, String password) {
        // Implementasikan logika validasi login di sini
        // Anda dapat memeriksa kredensial pengguna dengan sumber data seperti API, basis data, atau autentikasi Firebase, dll.
        // Untuk contoh ini, validasi akan selalu mengembalikan true jika username dan password tidak kosong.
        return !username.isEmpty() && !password.isEmpty();
    }
}
