package mg.tonymushah.itu.cloud.voiture.types.interfaces;

import java.util.Optional;
import java.util.UUID;

public abstract class WithUUID_ID_Nullable {
    private Optional<UUID> id;

    public Optional<UUID> getId() {
        return id;
    }

    public void setId(Optional<UUID> id) {
        this.id = id;
    }

    public WithUUID_ID_Nullable(Optional<UUID> id) {
        this.id = id;
    }

    public WithUUID_ID_Nullable() {
        this.setId(Optional.empty());
    }

}
