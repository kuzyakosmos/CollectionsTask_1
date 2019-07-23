/**
 * Необходимо реализовать коллекцию целых чисел, которая позволяет выполнять операции:
 * ● добавления
 * ● удаления
 * ● поиска элемента по значению
 * ● поиска элемента по индексу
 * ● поиска максимального элемента
 * ● поиска минимального элемента
 * ● поиска среднего арифметического всех элементов
 * <p>
 * При этом:
 * ● при добавлении нового элемента все элементы увеличивают своё значение на добавляемый элемент
 * ● при удалении - уменьшают своё значение на удаляемый элемент
 * <p>
 * Недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел.
 */

import java.util.ArrayList;

public class IntegerArray {

    ArrayList<Integer> array;

    public IntegerArray() {
        array = new ArrayList();
    }

    // Добавление
    boolean add(Integer e) {
        for (int i = 0; i < array.size(); i++) {
            array.set(i, array.get(i) + e);
        }

        array.add(e);
        return true;
    }

    // Удаление
    void delete(int index) {
        Integer e = array.get(index);

        array.remove(index);

        for (int i = 0; i < array.size(); i++) {
            array.set(i, array.get(i) - e);
        }
    }

    // Поиск по значению
    int get(Integer e) {
        return array.indexOf(e);
    }

    // Поиск по индексу
    Integer get(int index) {
        return array.get(index);
    }

    // Поиск масксимального элемента
    Integer getMax() {
        Integer temp = array.get(0);

        for (int i = 1; i < array.size(); i++) if (array.get(i) > temp) temp = array.get(i);

        return temp;
    }

    // Поиск минимального элемента
    Integer getMin() {
        Integer temp = array.get(0);

        for (int i = 1; i < array.size(); i++) if (array.get(i) < temp) temp = array.get(i);

        return temp;
    }

    // Поиск среднего арифметического всех элементов
    Integer getAverage() {
        Integer temp = 0;
        for (int i = 0; i < array.size(); i++) {
            temp += array.get(i);
        }
        return temp / array.size();
    }

    @Override
    public String toString() {
        return array.toString();
    }
}
