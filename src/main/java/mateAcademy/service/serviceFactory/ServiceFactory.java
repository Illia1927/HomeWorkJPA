package mateAcademy.service.serviceFactory;

import mateAcademy.dao.impl.DeviceDaoImpl;
import mateAcademy.dao.impl.PatientDaoImpl;
import mateAcademy.dao.impl.TestDaoImpl;
import mateAcademy.device.Device;
import mateAcademy.holder.EntityManagerHolder;
import mateAcademy.patients.Patient;
import mateAcademy.service.DeviceService;
import mateAcademy.service.impl.DeviceServiceImpl;
import mateAcademy.service.impl.TestServiceImpl;
import mateAcademy.service.PatientService;
import mateAcademy.service.impl.PatientServiceImpl;
import mateAcademy.service.TestService;
import mateAcademy.test.Test;

import javax.persistence.EntityManager;

public class ServiceFactory {
    private static final EntityManager entityManager;

    static {
        try {
            entityManager = EntityManagerHolder.getEntityManager();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static PatientService getPatientService() {
        return new PatientServiceImpl(new PatientDaoImpl(entityManager, Patient.class));
    }

    public static TestService getTestService() {
        return new TestServiceImpl(new TestDaoImpl(entityManager, Test.class));
    }

    public static DeviceService getDeviceService() {
        return new DeviceServiceImpl(new DeviceDaoImpl(entityManager, Device.class));
    }
}
