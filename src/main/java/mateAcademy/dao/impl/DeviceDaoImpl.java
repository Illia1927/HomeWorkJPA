package mateAcademy.dao.impl;

import mateAcademy.dao.AbstractDao;
import mateAcademy.dao.DeviceDao;
import mateAcademy.device.Device;

import javax.persistence.EntityManager;

public class DeviceDaoImpl extends AbstractDao<Device, Long> implements DeviceDao {
    public DeviceDaoImpl(EntityManager entityManager, Class<Device> deviceClass) {
        super(entityManager, deviceClass);
    }
}
