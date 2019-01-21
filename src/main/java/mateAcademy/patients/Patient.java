package mateAcademy.patients;

import mateAcademy.test.Test;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private long id;
    @Column
    private String name;
    @Column
    private String surName;
    @Column(name = "birth_date")
    private LocalDate birthsDate;

    @OneToMany(mappedBy = "patient", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Test> tests;

    public Patient() {
    }

    public Patient(String name, String surName, LocalDate birthsDate) {
        this.name = name;
        this.surName = surName;
        this.birthsDate = birthsDate;
        this.tests = tests;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthsDate() {
        return birthsDate;
    }

    public void setBirthsDate(LocalDate birthsDate) {
        this.birthsDate = birthsDate;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return  "Name : " + name +
                ", Sur name : " + surName +
                ", Date of birth : " + birthsDate;
    }

    public void addTest(Test test) {
        if (tests == null) {
            tests = new HashSet<>();
        }
        test.setPatient(this);
        tests.add(test);
    }

    public static class Builder {
        private String name;
        private String surName;
        private LocalDate birthsDate;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surName(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder birthsDate(LocalDate birthsDate) {
            this.birthsDate = birthsDate;
            return this;
        }

        public Patient build() {
            return new Patient(name, surName, birthsDate);
        }
    }
}
