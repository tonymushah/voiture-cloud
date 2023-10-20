package mg.tonymushah.itu.cloud.voiture.types;

import mg.tonymushah.itu.cloud.voiture.errors.InvalidImatriculationException;
import mg.tonymushah.itu.cloud.voiture.types.enums.ImatriculationType;

public class Imatriculation {
    private String inner;
    private ImatriculationType type;

    public String getInner() {
        return inner;
    }

    public void setInner(String inner) {
        this.inner = inner;
    }

    public ImatriculationType getType() {
        return type;
    }

    public void setType(ImatriculationType type) {
        this.type = type;
    }

    private Imatriculation(String inner, ImatriculationType type) {
        this.setInner(inner);
        this.setType(type);
    }

    public Imatriculation(String input) throws InvalidImatriculationException {
        this(input, ImatriculationType.getType(input));
    }
}
