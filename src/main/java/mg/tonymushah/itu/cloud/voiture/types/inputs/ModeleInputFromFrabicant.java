package mg.tonymushah.itu.cloud.voiture.types.inputs;

import java.util.Optional;
import java.util.UUID;

import mg.tonymushah.itu.cloud.voiture.types.interfaces.WithUUID_ID_Nullable;

public class ModeleInputFromFrabicant extends WithUUID_ID_Nullable {
    private Optional<String> name;

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public ModeleInputFromFrabicant() {
        super(Optional.empty());
        this.setName(Optional.empty());
    }

    public ModeleInputFromFrabicant(Optional<UUID> id, Optional<String> name) {
        super(id);
        this.setName(name);
    }

    public ModeleInputFromFrabicant(Optional<String> name) {
        this.setName(name);
    }

}
