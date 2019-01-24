package mateAcademy.service;

import mateAcademy.device.Device;
import mateAcademy.patients.Patient;
import mateAcademy.test.Test;

public interface DeviceService {

    Device addDevice(Device device);

    Device getDevice(Long id);

    void updateDevice(Device device);

    void deleteDevice(Device device);

    void deleteById(Long id);

    void runTest(Test test, Patient patient);
}
