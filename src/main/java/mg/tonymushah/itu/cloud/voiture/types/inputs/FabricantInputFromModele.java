package mg.tonymushah.itu.cloud.voiture.types.inputs;

import java.util.Optional;
import java.util.UUID;

import mg.tonymushah.itu.cloud.voiture.types.interfaces.WithUUID_ID_Nullable;

public class FabricantInputFromModele extends WithUUID_ID_Nullable {
    private Optional<String> nom;

    public Optional<String> getNom() {
        return nom;
    }

    public void setNom(Optional<String> nom) {
        this.nom = nom;
    }

    public FabricantInputFromModele() {
    }

    public FabricantInputFromModele(Optional<UUID> id) {
        super(id);
    }

    public FabricantInputFromModele(Optional<UUID> id, Optional<String> nom) {
        super(id);
        this.setNom(nom);
    }

}
