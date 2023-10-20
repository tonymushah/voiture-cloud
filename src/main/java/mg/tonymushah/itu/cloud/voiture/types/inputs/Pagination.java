package mg.tonymushah.itu.cloud.voiture.types.inputs;

/**
 * Pagination
 */
public class Pagination {

    private int offset;
    private int limit;
    public int getOffset() {
        return offset;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }
    public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    public Pagination() {
        this(0, 10);
    }
    public Pagination(int offset, int limit) {
        this.setOffset(offset);
        this.setLimit(limit);
    }

}
