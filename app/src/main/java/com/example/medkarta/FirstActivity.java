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

public class FirstActivity extends AppCompatActivity {
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
        patientList.add(new Patient("ФИО", "Щербанов Алексей Евгеньевич"));
        patientList.add(new Patient("Пол", "Мужской"));
        patientList.add(new Patient("Возраст", "40"));
        patientList.add(new Patient("Снилс", "123-432-324"));
        patientList.add(new Patient("ИНН", "3638439106"));
        patientList.add(new Patient("Полис", "3287465957282948"));
        patientList.add(new Patient("Дата рождение", "1974-09-19"));
        patientList.add(new Patient("Домашний адрес", "Проездная 24 кв. 48"));
        patientList.add(new Patient("На учете", "С 05.11.2024"));
        patientList.add(new Patient("Диагноз", "Все плохо"));
        patientList.add(new Patient("История болезней", "Пневмония"));
        patientList.add(new Patient("Лечащий врач", "Голованов Ф.А."));
        patientList.add(new Patient("Назначенное лечения", "Пить микстуру"));
        patientList.add(new Patient("Был на приеме", "14.11.2024"));
        
        patientListAdapter = new PatientListAdapter(this, patientList);
        listView.setAdapter(patientListAdapter);
    }
}

