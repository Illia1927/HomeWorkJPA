package mateAcademy.service.impl;

import mateAcademy.dao.TestDao;
import mateAcademy.service.TestService;
import mateAcademy.test.Test;

import java.time.LocalDate;
import java.util.List;

public class TestServiceImpl implements TestService {

    private final TestDao testDao;

    public TestServiceImpl(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public Test addTest(Test test) {
        return testDao.made(test);
    }

    @Override
    public Test getTest(Long id) {
        return testDao.findById(id);
    }

    @Override
    public void updateTest(Test test) {
        testDao.update(test);
    }

    @Override
    public void deleteTest(Test test) {
        testDao.delete(test);
    }

    @Override
    public void deleteById(Long id) {
        deleteTest(getTest(id));
    }


    @Override
    public List<Test> getAllTest() {
        return testDao.getAllTests();
    }

    @Override
    public List<Test> getAllTestsInDateRange(LocalDate from, LocalDate to) {
        return testDao.getAllTestsInDateRange(from, to);
    }
}
