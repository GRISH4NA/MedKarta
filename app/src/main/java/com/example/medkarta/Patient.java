package com.example.medkarta;

public class Patient {
    private String fio;
    private String gender;
    private int age;
    private String snils;
    private String inn;
    private String policy;
    private String birthDate;
    private String address;
    private String onRecord;
    private String diagnosis;
    private String history;
    private String doctor;
    private String treatment;
    private String appointment;

    // Конструктор
    public Patient(String fio, String gender) {
        this.fio = fio;
        this.gender = gender;

    }

    // Геттеры
    public String getFio() {
        return fio;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSnils() {
        return snils;
    }

    public String getInn() {
        return inn;
    }

    public String getPolicy() {
        return policy;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getOnRecord() {
        return onRecord;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getHistory() {
        return history;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getAppointment() {
        return appointment;
    }

    // Сеттеры
    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOnRecord(String onRecord) {
        this.onRecord = onRecord;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
}
