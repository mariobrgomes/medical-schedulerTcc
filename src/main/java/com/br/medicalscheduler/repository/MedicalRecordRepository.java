package com.br.medicalscheduler.repository;

import com.br.medicalscheduler.domain.record.MedicalRecord;

/**
 * Created by mario on 12/9/2015.
 */
public interface MedicalRecordRepository extends Repository {

    void save(MedicalRecord medicalRecord);

    MedicalRecord findMedicalRecordById(int id);

    void update(MedicalRecord medicalRecord);

    void delete(MedicalRecord medicalRecord);
}
