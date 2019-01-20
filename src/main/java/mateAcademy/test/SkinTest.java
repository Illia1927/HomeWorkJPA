package mateAcademy.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class SkinTest extends Test {
    @Column(name = "skinProblems")
    private Double skinProblems;

    public SkinTest() {
    }

    @Override
    public Double getResult() {
        return skinProblems;
    }

    @Override
    public void setResult(Double result) {
        skinProblems = result;
    }

    public SkinTest(String name, Double cost, LocalDate dateOfMade, Double skinProblems) {
        super(name, cost, dateOfMade);
        this.skinProblems = skinProblems;
    }

    public Double getSkinProblems() {
        return skinProblems;
    }

    public void setSkinProblems(Double skinProblems) {
        this.skinProblems = skinProblems;
    }

    @Override
    public String toString() {
        return "SkinTest : " +
                " skin problems = [" + skinProblems + "]";
    }
}
