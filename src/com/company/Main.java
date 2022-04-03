package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Formula();
        //task41();
        //task66();
       // task91();
         task116();
        // task141();
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

            if (i % 2 == 0) {
                System.out.println("Введите значение аргумента");
                array[i] = Integer.parseInt(scanner.next());
                temp = array[i];
            }
            if (i % 2 != 0) {
                array[i] = (int) Math.pow(temp, 2);
            }
        }
        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {

                System.out.printf(String.valueOf("x=" + array[i]));
            }
            if (i % 2 != 0) {
                System.out.println(" y=" + array[i]);
            }
        }
    }

    /**
     * 66.Найти произведение всех элементов массива целых чисел, меньших 0.
     */
    private static void task66() {

        System.out.println("Задание 66");

        long mult = 1;
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
        System.out.println("Рузультат произведения целых чисел меньших 0 =" + mult);
    }

    public static void ShiftToRight(int a[], int n) {
        int temp = a[n];

        for (int i = n; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;

        System.out.println("Array after shifting to right by one : " + Arrays.toString(a));

    }

    /**
     * 91.Удалить 10-й элемент одномерного массива целых чисел B(n).
     */
    private static void task91() {

        System.out.println("Задание 91");
        System.out.println("Введите размер массива B");
        int size = Integer.parseInt(scanner.next());
        int B[] = new int[size];

        for (int i = 0; i < B.length; i++) {
            System.out.println("Введите элементы массива");
            B[i] = Integer.parseInt(scanner.next());


        }
        //int  [] array = {1,2,3,4,5};
        int n = 10;
        System.out.println("Array " + Arrays.toString(B));
        ShiftToRight(B, n);

    }

    /**
     * 116.На k-e место одномерного массива целых чисел вставить элемент,
     * равный разности двух введенных с клавиатуры элементов.
     */
    private static void task116() {

        System.out.println("Задание 116");
        int dif=0;
        System.out.println("Введите размер массива");
        int size = Integer.parseInt(scanner.next());
        int array[] = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 1; i < size; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }
        System.out.println("Массив " + Arrays.toString(array));
        System.out.println("Введите k");
        int k = Integer.parseInt(scanner.next());
        System.out.println("Введите d");
        int d = Integer.parseInt(scanner.next());
        System.out.println("Введите p");
        int p = Integer.parseInt(scanner.next());
        dif=d/p;


        for(int i=0;i< array.length+1;i++)
        {
            if(i==k) {

                array[i] = dif;
            }

        }
        System.out.println("Массив после вставки элемента k " + Arrays.toString(array));


    }

    /**
     * 141.Даны две последовательности целых чисел а1, а2, ..., an и b1, b2, ..., bn.
     * Преобразовать последовательность b1, b2, ..., bn по следующему правилу:
     * если аi ≤ 0, то bi увеличить в 10 раз,
     * в противном случае bi заменить нулем (i = 1, 2, ..., n).
     */
    private static void task141() {

        System.out.println("Задание 141");

    }

    /**
     * Task number=41
     * Task number=66
     * Task number=91
     * Task number=116
     * Task number=141
     */
    private static void Formula() {

        int N = 18, K = 1, G = 1, task_num = 0;
        for (; K <= 5; K++) {


            task_num = (22 + N + (K - 1) * 25) + G;
            System.out.println("Task number=" + task_num);
        }

    }
}