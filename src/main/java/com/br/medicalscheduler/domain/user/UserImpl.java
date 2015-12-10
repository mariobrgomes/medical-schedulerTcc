package com.br.medicalscheduler.domain.user;

import com.br.medicalscheduler.domain.patient.Patient;

import javax.persistence.*;

/**
 * Created by mario on 12/8/2015.
 */
@Entity
@Table(name = "USER")

public class UserImpl implements User {

    @Id
    @GeneratedValue
    private long id;
    private Patient patient;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ROLE")
    private String role;

    public boolean login(long cardNumber, String pwd) {
        if (patient.verifyCardNumber(cardNumber) == true && pwd.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public String chooseRole(String r) {
        return null;
    }

    public enum Role {
        ADMIN, USER;
    }

}
