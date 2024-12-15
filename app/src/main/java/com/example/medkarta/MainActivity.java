package com.example.medkarta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    // Предопределенные логин и пароль
    private static final String CORRECT_USERNAME = "123";
    private static final String CORRECT_PASSWORD = "123";


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;



        });

            editTextUsername = findViewById(R.id.editTextTextEmailAddress);
            editTextPassword = findViewById(R.id.editTextTextPassword);
            buttonLogin = findViewById(R.id.button);

            buttonLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username = editTextUsername.getText().toString();
                    String password = editTextPassword.getText().toString();

                    // Проверка логина и пароля
                    if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                        // Переход на другую активность
                        Intent intent = new Intent(MainActivity.this, MainActivityList.class);
                        startActivity(intent);
                    } else {
                        // Сообщение об ошибке
                        Toast.makeText(MainActivity.this, "Неверный логин или пароль", Toast.LENGTH_SHORT).show();
                    }
                }

            });
    }
}

