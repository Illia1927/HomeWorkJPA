package mateAcademy.accessory;

import mateAcademy.device.Device;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UltrasonicAccessory extends Accessory {

    @Column
    private String nameOfGenerator;
    @Column
    private Boolean hose;

    public UltrasonicAccessory(){

    }

    public UltrasonicAccessory(Device device, String nameOfGenerator, Boolean hose) {
        super(device);
        this.nameOfGenerator = nameOfGenerator;
        this.hose = hose;
    }

    public String getNameOfGenerator() {
        return nameOfGenerator;
    }

    public void setNameOfGenerator(String nameOfGenerator) {
        this.nameOfGenerator = nameOfGenerator;
    }

    public Boolean getHose() {
        return hose;
    }

    public void setHose(Boolean hose) {
        this.hose = hose;
    }

    @Override
    public String toString() {
        return "UltrasonicAccessory{" +
                "nameOfGenerator='" + nameOfGenerator + '\'' +
                ", hose=" + hose +
                '}';
    }
}
