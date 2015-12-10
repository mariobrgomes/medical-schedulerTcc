package com.br.medicalscheduler.repository.dao;

import com.br.medicalscheduler.domain.record.MedicalRecord;
import com.br.medicalscheduler.repository.MedicalRecordRepository;
import com.br.medicalscheduler.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by mario on 12/9/2015.
 */

public class MedicalRecordDAO implements MedicalRecordRepository {

    Session session = HibernateUtil.getSessionFactory().openSession();

    public void save(MedicalRecord medicalRecord) {

        session.beginTransaction();
        session.save(medicalRecord);
        session.getTransaction().commit();
        session.close();

    }

    public MedicalRecord findMedicalRecordById(int id) {

        session.beginTransaction();
        MedicalRecord mr = session.get(MedicalRecord.class, id);
        session.getTransaction().commit();
        session.close();
        return mr;
    }

    public void update(MedicalRecord medicalRecord) {

        session.beginTransaction();
        session.update(medicalRecord);
        session.getTransaction().commit();
        session.close();

    }

    public void delete(MedicalRecord medicalRecord) {

        session.beginTransaction();
        session.delete(medicalRecord);
        session.getTransaction().commit();
        session.close();

    }
}
