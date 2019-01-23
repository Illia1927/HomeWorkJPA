package mateAcademy.device;

import mateAcademy.accessory.Accessory;
import mateAcademy.test.Test;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "device")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_device")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "cost")
    private Double cost;
    @OneToMany(mappedBy = "device", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Accessory> accessories;
    @OneToMany(mappedBy = "device", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Test> tests;

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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void addAccessory(Accessory accessory) {
        if (accessories == null) {
            accessories = new HashSet<>();
        }
        accessory.setDevice(this);
        accessories.add(accessory);
    }

    public void addTest(Test test) {
        if (tests == null) {
            tests = new HashSet<>();
        }
        test.setDevice(this);
        tests.add(test);
    }

    @Override
    public String toString() {
        return "device{" +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
