package mateAcademy.device;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity(name = "ultrasonic_device")
public class UltrasonicDevice extends Device{
    @Column(name = "weight")
    private Integer weight ;
    @Column(name = "dateOfMade")
    private LocalDate dateOfMade;

    public UltrasonicDevice() {
    }

    public UltrasonicDevice(Integer weight, LocalDate dateOfMade) {
        this.weight = weight;
        this.dateOfMade = dateOfMade;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    @Override
    public String toString() {
        return "UltrasonicDevice{" +
                "weight=" + weight +
                ", dateOfMade=" + dateOfMade +
                '}';
    }
}
