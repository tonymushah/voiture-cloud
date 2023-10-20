package mg.tonymushah.itu.cloud.voiture.types.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import mg.tonymushah.itu.cloud.voiture.errors.InvalidImatriculationException;
import mg.tonymushah.itu.cloud.voiture.types.Imatriculation;

@Entity
public class Vehicule {
    @Id
    private String im;
    private UUID modeleID;

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public UUID getModeleID() {
        return modeleID;
    }

    public void setModeleID(UUID modeleID) {
        this.modeleID = modeleID;
    }

    public Vehicule() {
    }

    public Vehicule(String im, UUID modeleID) {
        this.im = im;
        this.modeleID = modeleID;
    }

    public Imatriculation imatriculation() throws InvalidImatriculationException{
        return new Imatriculation(this.getIm());
    }
}
