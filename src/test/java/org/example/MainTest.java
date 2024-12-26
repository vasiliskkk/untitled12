package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// Проверим, что метод sort корректно сортирует массив целых чисел
// Исходный массив
// Ожидаемый результат после сортировки
// Вызов метода сортировки
// Проверка, что массив отсортирован правильно
class MainTest {
    @Test
    void sort() {
        Integer[] array = {5, 3, 8, 1, 2};
        Integer[] expected = {1, 2, 3, 5, 8};
        Main.sort(array);
        assertArrayEquals(expected, array);
    }
}