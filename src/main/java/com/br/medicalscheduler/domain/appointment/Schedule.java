package com.br.medicalscheduler.domain.appointment;

import java.util.Date;
import java.util.List;

/**
 * Created by mario on 12/9/2015.
 */
public interface Schedule {

    boolean checkAvailability(Date dateRequested, List<Date> dateAvailable, long cardNb, int crm);

    void scheduleAppointment();

    Date showAppointmentDate(Date date);
}
