package org.example;
import java.util.Arrays;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

// Устанавливаем кодировку UTF-8 для вывода в консоль
// Массив целых чисел
// Массив чисел типа double
// Массив символов
// Массив строк
// Обобщенный метод сортировки
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        System.setOut(out);

        Integer[] intArray = {5, 3, 8, 1, 2};
        sort(intArray);
        System.out.println("Отсортированный массив целых чисел: " + Arrays.toString(intArray));

        Double[] doubleArray = {5.5, 3.3, 8.8, 1.1, 2.2};
        sort(doubleArray);
        System.out.println("Отсортированный массив чисел типа double: " + Arrays.toString(doubleArray));

        Character[] charArray = {'D', 'a', 'c', 'b', '$'};
        sort(charArray);
        System.out.println("Отсортированный массив символов: " + Arrays.toString(charArray));

        String[] stringArray = {"азбука", "школа", "апельсин", "Огурец", "помидор"};
        sort(stringArray);
        System.out.println("Отсортированный массив строк: " + Arrays.toString(stringArray));
    }
    public static <T extends Comparable<T>> void sort(T[] array) {
        Arrays.sort(array);
    }
}



















