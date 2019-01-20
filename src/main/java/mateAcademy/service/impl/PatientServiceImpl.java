package mateAcademy.service.impl;

import mateAcademy.dao.PatientDao;
import mateAcademy.patients.Patient;
import mateAcademy.service.PatientService;

public class PatientServiceImpl implements PatientService {
    private final PatientDao patientDao;

    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public Patient addPatient(Patient patient) {
        return patientDao.made(patient);
    }

    @Override
    public Patient getPatient(Long id) {
        return patientDao.findById(id);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientDao.update(patient);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientDao.delete(patient);
    }
    @Override
    public void deleteById(Long id){
        deletePatient(getPatient(id));
    }
}
