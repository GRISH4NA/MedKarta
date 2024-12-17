package com.example.medkarta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivityList extends AppCompatActivity {


        private ListView listView;
        private String[] items = {"Щербанов Алексей Евгеньевич", "Ворапаев Николай Иванович"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });
        listView = findViewById(R.id.List);

        // Создание адаптера и привязка его к ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        // Установка слушателя нажатия на элемент списка
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                if (position == 0) {
                    // Переход на FirstActivity при нажатии на первый элемент
                    intent = new Intent(MainActivityList.this, FirstActivity.class);
                } else if (position == 1) {
                    // Переход на SecondActivity при нажатии на второй элемент
                    intent = new Intent(MainActivityList.this, SecondActivity.class);
                } else {
                    // Для остальных элементов можно добавить другую логику или оставить пустым
                    return;
                }
                startActivity(intent);
            }
        });
    }

}