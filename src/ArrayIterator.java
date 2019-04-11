import java.util.Iterator;

public class ArrayIterator implements Iterator {

    private int index = 0;
    Integer[] values;

    public ArrayIterator(Integer[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public Integer next() {
        return values[index++];
    }
}
