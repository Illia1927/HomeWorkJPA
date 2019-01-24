package mateAcademy.dao;

import mateAcademy.test.Test;

import java.time.LocalDate;
import java.util.List;

public interface TestDao extends CrudDao<Test, Long> {

    List<Test> getAllTests();

    List<Test> getAllTestsInDateRange(LocalDate from, LocalDate to);

}
