package mateAcademy.dao.impl;

import mateAcademy.accessory.Accessory;
import mateAcademy.dao.AbstractDao;
import mateAcademy.dao.AccessoryDao;

import javax.persistence.EntityManager;

public class AccessoryDaoImpl extends AbstractDao<Accessory, Long> implements AccessoryDao {
    public AccessoryDaoImpl(EntityManager entityManager, Class<Accessory> accessoryClass) {
        super(entityManager, accessoryClass);
    }
}
