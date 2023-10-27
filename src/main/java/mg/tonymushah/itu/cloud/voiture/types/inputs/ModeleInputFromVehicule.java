package mg.tonymushah.itu.cloud.voiture.types.inputs;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import mg.tonymushah.itu.cloud.voiture.types.interfaces.WithUUID_ID_Nullable;

public class ModeleInputFromVehicule extends WithUUID_ID_Nullable {
    private Optional<String> nom;
    private Optional<List<FabricantInputFromModele>> fabricant;

    public Optional<String> getNom() {
        return nom;
    }

    public void setNom(Optional<String> nom) {
        this.nom = nom;
    }

    public Optional<List<FabricantInputFromModele>> getFabricant() {
        return fabricant;
    }

    public void setFabricant(Optional<List<FabricantInputFromModele>> fabricant) {
        this.fabricant = fabricant;
    }

    public ModeleInputFromVehicule() {
    }

    public ModeleInputFromVehicule(Optional<UUID> id) {
        super(id);
    }

    public ModeleInputFromVehicule(Optional<UUID> id, Optional<String> nom,
            Optional<List<FabricantInputFromModele>> fabricant) {
        super(id);
        this.setNom(nom);
        this.setFabricant(fabricant);
    }

    public ModeleInputFromVehicule(Optional<String> nom, Optional<List<FabricantInputFromModele>> fabricant) {
        this.setNom(nom);
        this.setFabricant(fabricant);
    }

}
