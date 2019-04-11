/**
 * При добавлении нового элемента все элементы увеличивают своё значение на добавляемый элемент
 * При удалении - уменьшают своё значение на удаляемый элемент
 * Недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел
 */


public interface Simple extends Iterable {

    // Добавление
    boolean add(Integer e);

    // Удаление
    void delete(int index);

    // Поиск по значению
    Integer get(Integer e);

    // Поиск по индексу
    Integer get(int index);

    // Поиск масксимального элемента
    Integer getMax();

    // Поиск минимального элемента
    Integer getMin();

    // Поиск среднего арифметического всех элементов
    Integer getAverage();
}