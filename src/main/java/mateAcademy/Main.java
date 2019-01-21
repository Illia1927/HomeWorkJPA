package mateAcademy;

import mateAcademy.accessory.PhotomoterAccessory;
import mateAcademy.accessory.UltrasonicAccessory;
import mateAcademy.device.Device;
import mateAcademy.device.Photometer;
import mateAcademy.device.UltrasonicDevice;
import mateAcademy.patients.Patient;
import mateAcademy.service.DeviceService;
import mateAcademy.service.PatientService;
import mateAcademy.service.TestService;
import mateAcademy.service.serviceFactory.ServiceFactory;
import mateAcademy.test.Test;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        PatientService patientService = ServiceFactory.getPatientService();
        DeviceService deviceService = ServiceFactory.getDeviceService();
        TestService testService = ServiceFactory.getTestService();

        Patient patientOne = Patient
                .builder()
                .name("Illia")
                .surName("Moroz")
                .birthsDate(LocalDate.of(1998, 3, 4))
                .build();

//        patientService.addPatient(patientOne);

        Test testOne = Test.getTest(Test.typeOfTest.SKIN);
        Device ultraSonic = new UltrasonicDevice();
        ultraSonic.addAccessory(new UltrasonicAccessory());
        ultraSonic.addTest(testOne);
        testOne.setDevice(ultraSonic);
        deviceService.runTest(testOne, patientOne);

        System.out.println("Test number one for patient Illia : " + testOne.getResult());

        Patient patientTwo = Patient
                .builder()
                .name("Maria")
                .surName("Bereka")
                .birthsDate(LocalDate.of(2000, 8, 22))
                .build();

//        patientService.addPatient(patientTwo);

        Test testTwo = Test.getTest(Test.typeOfTest.BLOOD);
        Device photometr = new Photometer();
        photometr.addAccessory(new PhotomoterAccessory());
        photometr.addTest(testTwo);
        testTwo.setDevice(photometr);
        deviceService.runTest(testTwo, patientTwo);

        System.out.println("Test number two for patient Maria : " + testTwo.getResult());

        System.out.println(testService.getAllTest());

    }
}
