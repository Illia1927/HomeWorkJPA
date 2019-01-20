package mateAcademy.accessory;

import mateAcademy.device.Device;

import javax.persistence.*;
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
                "id=" + id +
                ", device=" + device +
                '}';
    }
}
