package com.br.medicalscheduler.domain.patient;

import com.br.medicalscheduler.domain.record.MedicalRecord;
import com.br.medicalscheduler.domain.record.PatientGeneralInformation;
import lombok.AllArgsConstructor;

import javax.persistence.*;

/**
 * Created by mario on 12/8/2015.
 */
@AllArgsConstructor
public class Patient {

    @Id
    @Column(name = "CARD_NUMBER")
    private long cardNumber;

    private PatientGeneralInformation information;
    private MedicalRecord medicalRecord;

    public boolean verifyCardNumber(long cardNb) {
        if (cardNb == cardNumber) {
            return true;
        } else {
            return false;
        }
    }


    public long getCardNumber() {
        return cardNumber;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPATIENT_GENERAL_INFORMATION")
    public PatientGeneralInformation getInformation() {
        return information;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idMEDICAL_RECORD")
    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }
}
