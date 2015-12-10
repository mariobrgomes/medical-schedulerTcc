package com.br.medicalscheduler.domain.appointment;

import com.br.medicalscheduler.domain.patient.Patient;
import com.br.medicalscheduler.domain.referenced.doctor.Doctor;

import java.util.Date;
import java.util.List;

/**
 * Created by mario on 12/8/2015.
 */
public class Appointment implements Schedule {

    private Date dateRequested;
    private Doctor doctor;
    private Patient patient;

    public boolean checkAvailability(Date dateRequested, List<Date> dateAvailable, long cardNb, int crm) {
        if (patient.verifyCardNumber(cardNb) && doctor.checkCrmVeracity(crm) == true) {
            for (Date date : dateAvailable) {
                if (dateRequested.equals(date)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void scheduleAppointment() {

    }

    public Date showAppointmentDate(Date date) {

        return null;
    }
}
