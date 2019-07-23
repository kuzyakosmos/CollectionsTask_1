public class Main {
    public static void main(String[] args) {

        IntegerArray array = new IntegerArray();

//        Добавление
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);
        array.add(1);
        System.out.println(array);

//        Среднее арифметическое
        System.out.println(array.getAverage());

//        Максимальный элемент
        System.out.println(array.getMax());

//        Минимальный элемент
        System.out.println(array.getMin());

//        Поиск по индексу
        System.out.println(array.get(0));

//        Поиск по значению
        Integer a = 0;
        System.out.println(array.get(a));

//        Удаление
        array.delete(5);
        System.out.println(array);
    }
}
