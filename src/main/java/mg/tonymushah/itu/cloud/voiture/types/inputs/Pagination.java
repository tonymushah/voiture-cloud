package mg.tonymushah.itu.cloud.voiture.types.inputs;

public record Pagination(int offset, int limit) {

    public int offset() {
        return offset;
    }

    public int limit() {
        return limit;
    }
    
}
