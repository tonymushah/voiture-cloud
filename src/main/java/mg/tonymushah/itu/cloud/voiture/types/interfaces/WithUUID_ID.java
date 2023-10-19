package mg.tonymushah.itu.cloud.voiture.types.interfaces;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public abstract class WithUUID_ID {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public WithUUID_ID() {
    }

    public WithUUID_ID(UUID id) {
        this.id = id;
    }
    
}
