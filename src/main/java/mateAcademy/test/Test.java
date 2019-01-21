package mateAcademy.test;

import mateAcademy.device.Device;
import mateAcademy.patients.Patient;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Test")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_test")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "cost")
    private Double cost;
    @Column
    private LocalDate dateOfMade;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_patient")
    private Patient patient;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_device")
    private Device device;

    public Test() {
    }

    public Test(String name, Double cost, LocalDate dateOfMade) {
        this.name = name;
        this.cost = cost;
        this.dateOfMade = dateOfMade;
    }

    public Long getId() {
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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public abstract Double getResult();

    public abstract void setResult(Double result);

    public static Test getTest(typeOfTest testType) {
        switch (testType) {
            case SKIN:
                return new SkinTest();
            case BLOOD:
                return new BloodTest();
        }
        return null;
    }

    public static enum typeOfTest {
        BLOOD,
        SKIN
    }

    @Override
    public String toString() {
        return "Test{" +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", dateOfMade=" + dateOfMade +
                '}';
    }
}
