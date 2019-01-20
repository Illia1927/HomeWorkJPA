package mateAcademy.service;

import mateAcademy.patients.Patient;

public interface PatientService{

    Patient addPatient(Patient patient);

    Patient getPatient(Long id);

    void updatePatient(Patient patient);

    void deletePatient(Patient patient);

    void deleteById(Long id);
}
