package mateAcademy.dao.impl;

import mateAcademy.dao.AbstractDao;
import mateAcademy.dao.PatientDao;
import mateAcademy.patients.Patient;

import javax.persistence.EntityManager;

public class PatientDaoImpl extends AbstractDao<Patient, Long> implements PatientDao {
    public PatientDaoImpl(EntityManager entityManager, Class<Patient> patientClass) {
        super(entityManager, patientClass);
    }
}
