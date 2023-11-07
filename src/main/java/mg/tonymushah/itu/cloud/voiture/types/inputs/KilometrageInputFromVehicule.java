package mg.tonymushah.itu.cloud.voiture.types.inputs;

import java.time.OffsetDateTime;
import java.util.Optional;

public class KilometrageInputFromVehicule {
    private OffsetDateTime date;
    private int debut;
    private Optional<Integer> fin;

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

    public KilometrageInputFromVehicule() {
    }

    public KilometrageInputFromVehicule(OffsetDateTime date, int debut, Optional<Integer> fin) {
        this.setDate(date);
        this.setDebut(debut);
        this.setFin(fin);
    }

}
