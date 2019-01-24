package mateAcademy.device;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "Photometer")
public class Photometer extends Device{
    @Column
    private boolean photodiode;
    @Column
    private String lenses;

    public Photometer() {
    }

    public Photometer(boolean photodiode, String lenses) {
        this.photodiode = photodiode;
        this.lenses = lenses;
    }

    public boolean Photodiode() {
        return photodiode;
    }

    public void setPhotodiode(boolean photodiode) {
        this.photodiode = photodiode;
    }

    public String getLenses() {
        return lenses;
    }

    public void setLenses(String lenses) {
        this.lenses = lenses;
    }

    @Override
    public String toString() {
        return "Photometer{" +
                "photodiode=" + photodiode +
                ", lenses='" + lenses + '\'' +
                '}';
    }
}
