package com.br.medicalscheduler.beans;


import com.br.medicalscheduler.domain.record.MedicalRecord;
import com.br.medicalscheduler.repository.dao.MedicalRecordDAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by mario on 12/9/2015.
 */

@ManagedBean(name = "medicalRecordBean", eager = true)
@RequestScoped
public class MedicalRecordBean {


    private int age;
    private double height;
    private double weight;
    private String disease;
    private boolean chronicDiseases;
    private String bloodGroup;
    private boolean donator;
    private String alergies;
    private String medicineTaken;

    public void saveMedicalRecord() {
        MedicalRecordDAO medicalRecordDAO = new MedicalRecordDAO();

        MedicalRecord medicalRecord = new MedicalRecord(age, height, weight, disease, chronicDiseases, bloodGroup,
                donator, alergies, medicineTaken);
        medicalRecordDAO.save(medicalRecord);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public boolean isChronicDiseases() {
        return chronicDiseases;
    }

    public void setChronicDiseases(boolean chronicDiseases) {
        this.chronicDiseases = chronicDiseases;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public boolean isDonator() {
        return donator;
    }

    public void setDonator(boolean donator) {
        this.donator = donator;
    }

    public String getAlergies() {
        return alergies;
    }

    public void setAlergies(String alergies) {
        this.alergies = alergies;
    }

    public String getMedicineTaken() {
        return medicineTaken;
    }

    public void setMedicineTaken(String medicineTaken) {
        this.medicineTaken = medicineTaken;
    }


}
