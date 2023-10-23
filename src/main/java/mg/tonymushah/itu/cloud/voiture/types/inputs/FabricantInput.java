package mg.tonymushah.itu.cloud.voiture.types.inputs;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import mg.tonymushah.itu.cloud.voiture.types.interfaces.WithUUID_ID_Nullable;

public class FabricantInput extends WithUUID_ID_Nullable {
    private Optional<String> nom;
    private Optional<List<ModeleInputFromFrabicant>> modeles;

    public Optional<String> getNom() {
        return nom;
    }

    public void setNom(Optional<String> nom) {
        this.nom = nom;
    }

    public Optional<List<ModeleInputFromFrabicant>> getModeles() {
        return modeles;
    }

    public void setModeles(Optional<List<ModeleInputFromFrabicant>> modeles) {
        this.modeles = modeles;
    }

    public FabricantInput() {
        super(Optional.empty());
        this.setModeles(Optional.empty());
        this.setNom(Optional.empty());
    }

    public FabricantInput(Optional<UUID> id) {
        super(id);
        this.setModeles(Optional.empty());
        this.setNom(Optional.empty());
    }

    public FabricantInput(Optional<UUID> id, Optional<String> nom, Optional<List<ModeleInputFromFrabicant>> modeles) {
        super(id);
        this.setNom(nom);
        this.setModeles(modeles);
    }

}
