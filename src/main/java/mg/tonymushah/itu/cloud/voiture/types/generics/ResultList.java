package mg.tonymushah.itu.cloud.voiture.types.generics;

public class ResultList<T> {
    private int offset;
    private int limit;
    private int total;
    private T data;

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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResultList(int offset, int limit, int total, T data) {
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.data = data;
    }

    public ResultList() {
    }

}
