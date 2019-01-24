package mateAcademy.dao.impl;

import mateAcademy.dao.AbstractDao;
import mateAcademy.dao.TestDao;
import mateAcademy.test.Test;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

public class TestDaoImpl extends AbstractDao<Test, Long> implements TestDao {
    public TestDaoImpl(EntityManager entityManager, Class<Test> testClass) {
        super(entityManager, testClass);
    }

    @Override
    public List<Test> getAllTests() {
        return entityManager
                .createQuery("from Test", Test.class).getResultList();
    }

    @Override
    public List<Test> getAllTestsInDateRange(LocalDate from, LocalDate to) {
        return entityManager
                .createQuery("select t " +
                        "from Test t " +
                        "where t.dateOfMade >= :up and t.dateOfMade <= :to", Test.class)
                .setParameter("up", from)
                .setParameter("to", to)
                .getResultList();
    }
}
