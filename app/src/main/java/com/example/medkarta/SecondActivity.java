package com.example.medkarta;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private ListView listView;
    private PatientListAdapter patientListAdapter;
    private List<Patient> patientList;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_first);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listView = findViewById(R.id.list);

        // Пример данных
        patientList = new ArrayList<>();
        patientList.add(new Patient("ФИО", "Ворапаев Николай Иванович"));
        patientList.add(new Patient("Пол", "Мужской"));
        patientList.add(new Patient("Возраст", "24"));
        patientList.add(new Patient("Снилс", "345-673-879"));
        patientList.add(new Patient("ИНН", "8693789045"));
        patientList.add(new Patient("Полис", "8624896893589987"));
        patientList.add(new Patient("Дата рождения", "2000-09-19"));
        patientList.add(new Patient("Домашний адрес", "Крышная 6А кв. 37"));
        patientList.add(new Patient("На учете", "С 07.11.2024"));
        patientList.add(new Patient("Диагноз", "Кариес"));
        patientList.add(new Patient("История болезней", "Гастрит, гайморит"));
        patientList.add(new Patient("Лечащий врач", "Лейнинг Э.Е."));
        patientList.add(new Patient("Назначенное лечения", "Полоскайте рот"));
        patientList.add(new Patient("Был на приеме", "15.11.2024"));

        patientListAdapter = new PatientListAdapter(this, patientList);
        listView.setAdapter(patientListAdapter);
    }
}

