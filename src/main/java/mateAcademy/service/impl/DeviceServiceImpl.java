package mateAcademy.service.impl;

import mateAcademy.dao.DeviceDao;
import mateAcademy.device.Device;
import mateAcademy.patients.Patient;
import mateAcademy.service.DeviceService;
import mateAcademy.test.Test;

import java.time.LocalDate;

public class DeviceServiceImpl implements DeviceService {

    private final DeviceDao deviceDao;

    public DeviceServiceImpl(DeviceDao deviceDao) {
        this.deviceDao = deviceDao;
    }

    @Override
    public Device addDevice(Device device) {
        return deviceDao.create(device);
    }

    @Override
    public Device getDevice(Long id) {
        return deviceDao.findById(id);
    }

    @Override
    public void updateDevice(Device device) {
        deviceDao.update(device);
    }

    @Override
    public void deleteDevice(Device device) {
        deviceDao.delete(device);
    }

    @Override
    public void deleteById(Long id) {
        deleteDevice(getDevice(id));
    }

    public static class ResultTest{
        public static Double getResult(){
            return Math.random()*10;
        }
    }

    @Override
    public void runTest(Test test, Patient patient) {
        test.setDateOfMade(LocalDate.now());
        test.setResult(ResultTest.getResult());
        patient.addTest(test);
        addDevice(test.getDevice());
    }
}
