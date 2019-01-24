package mateAcademy.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BloodTest extends Test {
    @Column(name = "levelOfGlucos")
    private Double levelOfGlucos;

    public BloodTest() {
    }

    @Override
    public Double getResult() {
        return levelOfGlucos;
    }

    @Override
    public void setResult(Double result) {
        levelOfGlucos = result;
    }

    public BloodTest(String name, Double cost, LocalDate dateOfMade, Double levelOfGlucos) {
        super(name, cost, dateOfMade);
        this.levelOfGlucos = levelOfGlucos;
    }

    public Double getLevelOfGlucos() {
        return levelOfGlucos;
    }

    public void setLevelOfGlucos(Double levelOfGlucos) {
        this.levelOfGlucos = levelOfGlucos;
    }

    @Override
    public String toString() {
        return "BloodTest : " +
                "level Of Glucos = [" + levelOfGlucos + "]";
    }
}
