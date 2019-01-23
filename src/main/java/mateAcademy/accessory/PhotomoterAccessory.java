package mateAcademy.accessory;

import mateAcademy.device.Device;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PhotomoterAccessory extends Accessory {

    @Column
    private Boolean lenses;
    @Column
    private String sensor;

    public PhotomoterAccessory(){

    }

    public PhotomoterAccessory(Device device, Boolean lenses, String sensor) {
        super(device);
        this.lenses = lenses;
        this.sensor = sensor;
    }

    public Boolean getLenses() {
        return lenses;
    }

    public void setLenses(Boolean lenses) {
        this.lenses = lenses;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "PhotomoterAccessory{" +
                "lenses=" + lenses +
                ", sensor='" + sensor + '\'' +
                '}';
    }
}
