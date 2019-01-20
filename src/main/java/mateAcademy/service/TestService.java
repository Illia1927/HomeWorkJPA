package mateAcademy.service;

import mateAcademy.test.Test;

import java.time.LocalDate;
import java.util.List;

public interface TestService {

    Test addTest(Test test);

    Test getTest(Long id);

    void updateTest(Test test);

    void deleteTest(Test test);

    void deleteById(Long id);

    List<Test> getAllTest();

    List<Test> getAllTestsInDateRange(LocalDate from, LocalDate to);
}
