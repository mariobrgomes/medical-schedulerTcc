package com.br.medicalscheduler.domain.referenced.doctor;

import com.br.medicalscheduler.domain.referenced.Referenced;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by mario on 12/8/2015.
 */

@Data
@Entity
@Table(name = "DOCTOR")
public abstract class Doctor implements Referenced {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "CRM", unique = true)
    private int crm;

    @Column(name = "CNPJ", unique = true)
    private int cnpj;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "NEIGHBOURHOOD")
    private String neighbourhood;

    @Column(name = "CEP", unique = true)
    private int cep;

    @Column(name = "PHONE")
    private int phone;

    private String city;

    private String state;

    private List<Date> calendarAvailable;

    public boolean checkCrmVeracity(int crmNb) {
        if (crm == crmNb) {
            return true;
        } else {
            return false;
        }
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CITY_idCITY")
    public String getCity() {
        return city;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "STATE_idSTATE")
    public String getState() {
        return state;
    }

}
