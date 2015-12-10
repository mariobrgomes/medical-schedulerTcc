package com.br.medicalscheduler.domain.record;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by mario on 12/8/2015.
 */
@Data
@Entity
@Table(name = "PATIENT_GENERAL_INFORMATION")
public class PatientGeneralInformation implements Record {

    @Id
    @Column(name = "idPATIENT_GENERAL_INFORMATION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "MAIL")
    private String mail;

    @Column(name = "AGE")
    private int age;

    @Column(name = "CPF")
    private long cpf;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CEP")
    private int cep;

    @Column(name = "PHONE")
    private int phone;
}
