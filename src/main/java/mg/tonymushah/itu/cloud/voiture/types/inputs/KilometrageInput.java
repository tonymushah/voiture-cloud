package mg.tonymushah.itu.cloud.voiture.types.inputs;

import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;

import mg.tonymushah.itu.cloud.voiture.types.interfaces.WithUUID_ID_Nullable;

public class KilometrageInput extends WithUUID_ID_Nullable {
    private String vehicule;
    private OffsetDateTime date;
    private int debut;
    private Optional<Integer> fin;

    public String getVehicule() {
        return vehicule;
    }

    public void setVehicule(String vehicule) {
        this.vehicule = vehicule;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
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

    public KilometrageInput() {
        super();
        this.setFin(Optional.empty());
    }

    public KilometrageInput(Optional<UUID> id, String vehicule, OffsetDateTime date, int debut) {
        super(id);
        this.setVehicule(vehicule);
        this.setDate(date);
        this.setDebut(debut);
        this.setFin(Optional.empty());
    }

    public KilometrageInput(Optional<UUID> id, String vehicule, OffsetDateTime date, int debut, Optional<Integer> fin) {
        super(id);
        this.setVehicule(vehicule);
        this.setDate(date);
        this.setDebut(debut);
        this.setFin(fin);
    }

}
