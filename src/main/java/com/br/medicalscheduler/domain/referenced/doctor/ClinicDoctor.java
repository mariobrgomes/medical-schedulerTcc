package com.br.medicalscheduler.domain.referenced.doctor;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by mario on 12/8/2015.
 */
@Data
@Table(name = "CLINIC_DOCTOR")
public class ClinicDoctor {

    @Column(name = "HOSPITAL_NAME")
    private String hospital;
}
