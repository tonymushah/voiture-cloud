package mg.tonymushah.itu.cloud.voiture.types.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import mg.tonymushah.itu.cloud.voiture.types.interfaces.WithUUID_ID;

@Entity
public class Frabicant extends WithUUID_ID {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Frabicant(String nom) {
        this.nom = nom;
    }

    public Frabicant() {
    }

    public Frabicant(UUID id, String nom) {
        super(id);
        this.setId(id);;
    }
    
}
