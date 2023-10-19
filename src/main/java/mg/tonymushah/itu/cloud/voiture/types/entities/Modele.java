package mg.tonymushah.itu.cloud.voiture.types.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import mg.tonymushah.itu.cloud.voiture.types.interfaces.WithUUID_ID;

@Entity
public class Modele extends WithUUID_ID {
    private String nom;
    private UUID fabricantID;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public UUID getFabricantID() {
        return fabricantID;
    }

    public void setFabricantID(UUID fabricantID) {
        this.fabricantID = fabricantID;
    }

    public Modele() {
    }

    public Modele(UUID id, String nom, UUID fabricantID) {
        super(id);
        this.setNom(nom);
        this.setFabricantID(fabricantID);
    }

}
