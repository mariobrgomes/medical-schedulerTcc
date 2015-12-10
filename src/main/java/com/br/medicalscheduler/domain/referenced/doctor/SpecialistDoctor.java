package com.br.medicalscheduler.domain.referenced.doctor;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * Created by mario on 12/8/2015.
 */

@Data
@Table(name = "SPECIALIST_DOCTOR")
public class SpecialistDoctor extends Doctor {

    @Column(name = "SPECIALTY")
    private String specialty;


}
