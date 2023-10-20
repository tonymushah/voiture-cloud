package mg.tonymushah.itu.cloud.voiture.types.entities;

import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.Entity;
import mg.tonymushah.itu.cloud.voiture.types.interfaces.WithUUID_ID;

@Entity
public class Kilometrage extends WithUUID_ID {
    private String vehicIma;
    private OffsetDateTime inputDate;
    private int debut;
    private Optional<Integer> fin;

    public String getVehicIma() {
        return vehicIma;
    }

    public void setVehicIma(String vehicIma) {
        this.vehicIma = vehicIma;
    }

    public OffsetDateTime getInputDate() {
        return inputDate;
    }

    public void setInputDate(OffsetDateTime inputDate) {
        this.inputDate = inputDate;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public Optional<Integer> getFin() {
        return fin;
    }

    public void setFin(Optional<Integer> fin) {
        this.fin = fin;
    }

    public Kilometrage() {
    }

    public Kilometrage(UUID id, String vehicIma, OffsetDateTime inputDate, int debut, Optional<Integer> fin) {
        super(id);
        this.setVehicIma(vehicIma);
        this.setInputDate(inputDate);
        this.setDebut(debut);
        this.setFin(fin);
    }

    public Kilometrage(String vehicIma, OffsetDateTime inputDate, int debut, Optional<Integer> fin) {
        this.vehicIma = vehicIma;
        this.inputDate = inputDate;
        this.debut = debut;
        this.fin = fin;
    }

}
