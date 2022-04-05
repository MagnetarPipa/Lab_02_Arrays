package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // task41();
        //task66();
        //task91();
        task116();
        //task141();
    }

    /**
     * 41.В одномерном массиве размещены: в нечетных элементах — значения аргумента,
     * в четных — соответствующие им значения функции.
     * Напечатать элементы этого массива в виде двух параллельных столбцов
     * (аргумент и значения функции).
     */
    private static void task41() {
        System.out.println("Задание 41");
        int temp = 0;
        int array[] = new int[10];
        System.out.println("Функция y=x^2");

        for (int i = 0; i < array.length; i++) {
            //i++2
            if (i % 2 == 0) {
                System.out.println("Введите значение аргумента");
                array[i] = Integer.parseInt(scanner.next());
                temp = array[i];
            }
            if (i % 2 != 0) {
                array[i] = (int) Math.pow(temp, 2);
            }
        }
        for (int i = 0; i < array.length; i += 2) {

            System.out.printf(String.valueOf("\n x=" + array[i] + " y=" + array[i + 1]));

        }
    }

    /**
     * 66.Найти произведение всех элементов массива целых чисел, меньших 0.
     */
    private static void task66() {

        System.out.println("Задание 66");

        int mult = 1;
        System.out.println("Введите размер массива");
        int size = Integer.parseInt(scanner.next());
        int array[] = new int[size];

        for (int i = 1; i < size; i++) {
            array[i] = (int) (-50 + Math.random() * 100);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0) {
                mult = mult * array[i];
            }
        }
        System.out.println("Рузультат произведения целых чисел меньших 0 =-" + mult);
    }

    /**
     * 91.Удалить 10-й элемент одномерного массива целых чисел B(n).
     */
    private static void task91() {

        System.out.println("Задание 91");
        System.out.println("Введите размер массива B");
        int temp = 0;
        int size = Integer.parseInt(scanner.next());
        int B[] = new int[size];

        for (int i = 0; i < B.length; i++) {

            B[i] = (int) (Math.random() * 20);
        }
        System.out.println("Массив b до удаления элемента" + Arrays.toString(B));

        System.out.println("Введите номер элемента для удаления: ");
        int k = Integer.parseInt(scanner.next());
        System.out.println("Массив без " + k + " элемента: ");
        for (int i = 0; i < size - 1; i++) {

            if (i >= k - 1) {
                temp = B[i];
                B[i] = B[i + 1];
                B[i + 1] = 0;
            }
        }
        B = Arrays.copyOf(B, B.length - 1);
        System.out.println("Массив с удаленым элементом " + Arrays.toString(B));

    }

    /**
     * 116.На k-e место одномерного массива целых чисел вставить элемент,
     * равный разности двух введенных с клавиатуры элементов.
     */
    private static void task116() {

        System.out.println("Задание 116");
        System.out.println("Введите значение k");
        int k = Integer.parseInt(scanner.next());
        //int size = Integer.parseInt(scanner.next());
        int array[] = new int[k + 20];
        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (1 + Math.random() * 100);

        }
        System.out.println(Arrays.toString(array));
        array = Arrays.copyOf(array, array.length + 1);
        for (int i = array.length - 1; i >= k; i--) {

            array[i] = array[i - 1];

        }
        array[k - 1] = (array[4] - array[6]);
        System.out.println(Arrays.toString(array));

    }

    /**
     * 141.Даны две последовательности целых чисел а1, а2, ..., an и b1, b2, ..., bn.
     * Преобразовать последовательность b1, b2, ..., bn по следующему правилу:
     * если аi ≤ 0, то bi увеличить в 10 раз,
     * в противном случае bi заменить нулем (i = 1, 2, ..., n).
     */
    private static void task141() {

        System.out.println("Задание 141");
        System.out.println("Введите размер массива");
        int temp = 0;
        int size = Integer.parseInt(scanner.next());
        int array_a[] = new int[size];
        int array_b[] = new int[size];

        for (int i = 0; i < size; i++) {
            array_a[i] = (int) (-50 + Math.random() * 100);
        }

        System.out.println("Массив последовательности a " + Arrays.toString(array_a));
        System.out.println("Массив последовательности b " + Arrays.toString(array_b));

        for (int i = 0; i < array_a.length; i++) {

            if (array_a[i] < 0) {
                array_b[i] = array_a[i] * 10;
            } else {
                array_b[i] = 0;
            }
        }
        System.out.println("Массив последовательности a после замены значений в b " + Arrays.toString(array_a));
        System.out.println("Массив последовательности b после замены чисел " + Arrays.toString(array_b));

    }

}
