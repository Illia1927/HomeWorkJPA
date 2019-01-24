package mateAcademy.accessory;

import mateAcademy.device.Device;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Accessory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "accessory_id")
    private Long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "device_id")
    private Device device;

    public Accessory() {
    }

    public Accessory(Device device) {
        this.device = device;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "accessory{" +
                ", device=" + device +
                '}';
    }
}
