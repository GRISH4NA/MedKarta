package com.example.medkarta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class PatientListAdapter extends ArrayAdapter<Patient> {
    private final Context context;
    private final List<Patient> patients;

    public PatientListAdapter(Context context, List<Patient> patients) {
        super(context, R.layout.obshi, patients);
        this.context = context;
        this.patients = patients;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Получаем текущего пациента
        Patient patient = patients.get(position);

        // Используем паттерн ViewHolder для повышения производительности
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.obshi, parent, false);
            holder = new ViewHolder();
            holder.tvFio = convertView.findViewById(R.id.fio);
            holder.tvGender = convertView.findViewById(R.id.content);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Устанавливаем данные в текстовые поля
        holder.tvFio.setText(patient.getFio());
        holder.tvGender.setText(patient.getGender());


        return convertView;
    }

    static class ViewHolder {
        TextView tvFio, tvGender;
    }
}
