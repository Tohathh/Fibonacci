package com.company;

import java.util.Scanner;

public class Fibonacci {
    /*
    алгоритм поиска числа Фибоначчи
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set the size of the array");
        int n = scanner.nextInt();

        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; ++i) { //заполнение массива числами Фибоначчи
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }
    }
}
