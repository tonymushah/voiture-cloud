package mg.tonymushah.itu.cloud.voiture.types.generics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mg.tonymushah.itu.cloud.voiture.types.inputs.Pagination;

public class ResultList<T> {
    private int offset;
    private int limit;
    private long total;
    private List<T> data;

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

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public ResultList(int offset, int limit, long total, List<T> data) {
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.data = data;
    }

    public ResultList() {
    }
    public ResultList(Stream<T> stream, Pagination pagination) {
        this.setOffset(pagination.getOffset());
        this.setLimit(pagination.getLimit());
        this.setData(stream.parallel().skip(offset).limit(limit).collect(Collectors.toList()));
        this.setTotal(stream.count());
    }
}
