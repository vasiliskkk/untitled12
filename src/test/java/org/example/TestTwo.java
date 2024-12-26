package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Проверим, что метод sort корректно сортирует массив чисел double
// Исходный массив
// Ожидаемый результат после сортировки
// Вызов метода сортировки
// Проверка, что массив отсортирован правильно
class TestTwo {
    @Test
    void sort() {
        Double[] array = {5.5, 3.3, 8.8, 1.1, 2.2};
        Double[] expected = {1.1, 2.2, 3.3, 5.5, 8.8};
        Main.sort(array);
        assertArrayEquals(expected, array);
    }
}