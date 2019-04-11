public class SimpleArray implements Simple {

    public static void main(String[] args) {
        Simple ints = new SimpleArray();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);

        System.out.println(ints.get(1));
        System.out.println(ints);
    }

    private Integer[] values;

    public SimpleArray() {
        values = new Integer[0];
    }

    @Override
    public boolean add(Integer e) {
        Integer[] temp = values;
        for(int i: temp) i += e;
        values = new Integer[temp.length + 1];
        System.arraycopy(temp, 0, values, 0, temp.length);
        values[values.length - 1] = e;
        return true;
    }

    @Override
    public void delete(int index) {
        Integer[] temp = values;
        for(int i: temp) i -= get(index);
        values = new Integer[temp.length - 1];
        System.arraycopy(temp, 0, values, 0, index);
        int amountElemAfterIndex = temp.length - 1;
        System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex);
    }

    @Override
    public Integer get(Integer e) {
        return null;
    }

    @Override
    public Integer get(int index) {
        return values[index];
    }

    @Override
    public Integer getMax() {
        return null;
    }

    @Override
    public Integer getMin() {
        return null;
    }

    @Override
    public Integer getAverage() {
        return null;
    }


    @Override
    public ArrayIterator iterator() {
        return new ArrayIterator(values);
    }

    @Override
    public String toString() {
        ArrayIterator it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            Integer e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
}
