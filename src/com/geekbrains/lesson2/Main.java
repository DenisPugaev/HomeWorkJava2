package com.geekbrains.lesson2;
//Created by: Pugaev Denis
import com.geekbrains.lesson2.exception.MyArrayDataException;
import com.geekbrains.lesson2.exception.MyArraySizeException;

import java.util.Scanner;
/*
Homework
for
Java2 lesson 2

Задача:
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
 */
public class Main {

    public static void main(String[] args) {
        int total;
        Scanner sc = new Scanner(System.in); // Создается сканер
        System.out.print("Введите число 4 для создания массива 4x4(Другое число вызовет ошибку):  ");
        int n = sc.nextInt(); // Просит ввести длину массива в формате n на n;
        String[][] array = new String[n][n]; // создаю новый массив с длиной n введеной пользователем;

        for (int i = 0; i < array.length; i++) {   //Перебираю массив и вкладываю в него значение;
            for (int j = 0; j < array[i].length; j++) {
//                array[0][0] = "5";// Для примера вынесены некоторые индексы массива для проверки ошибки попадания в массив некорректного символа можно изменить  любое значение значение;
//                array[0][1] = "x";
//                array[0][2] = "12";
                array[i][j] = "7"; //Для примера вложил одно число для всего массива(можно конечно расписать все значения массива,но так быстрее);
            }
        }

        try {
            total = testArrayEx(array);
            System.out.println("Сумма чисел массива равна: "+total);
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    private static int testArrayEx(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException(String.format("Введенный массив не нужного размера 4x4,а некоректного %sx%s ! ", array.length, array.length));
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректный символ в кооринатах: [ " + i + "," + j + " ] " + "Символ: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}
        














