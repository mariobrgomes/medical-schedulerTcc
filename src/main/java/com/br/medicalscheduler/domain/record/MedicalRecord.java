package com.br.medicalscheduler.domain.record;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by mario on 12/8/2015.
 */
@Entity
@Table(name = "MEDICAL_RECORD")
@Data
public class MedicalRecord implements Record {

    @Id
    @Column(name = "idMEDICAL_RECORD")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "AGE")
    private int age;

    @Column(name = "HEIGHT")
    private double height;

    @Column(name = "WEIGHT")
    private double weight;

    @Column(name = "DISEASE")
    private String disease;

    @Column(name = "CHRONIC_DISEASES")
    private boolean chronicDiseases;

    @Column(name = "BLOOD_GROUP")
    private String bloodGroup;

    @Column(name = "DONATOR")
    private boolean donator;

    @Column(name = "ALERGIES")
    private String alergies;

    @Column(name = "MEDICINE_TAKEN")
    private String medicineTaken;

    public MedicalRecord(int age, double height, double weight, String disease, boolean chronicDiseases, String bloodGroup, boolean donator, String alergies, String medicineTaken) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.disease = disease;
        this.chronicDiseases = chronicDiseases;
        this.bloodGroup = bloodGroup;
        this.donator = donator;
        this.alergies = alergies;
        this.medicineTaken = medicineTaken;
    }


}
