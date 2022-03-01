package com.company;

import java.util.Scanner;
    /*
    алгоритм поиска числа Фибоначчи через рекурсию
    */
public class RecursionFibonacci {

    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
    public static void main (String[] args) {
        // считывание переменной n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите по счету число Фибоначчи");
        int n = scanner.nextInt();

        // получение n-ого по счёту числа Фибоначчи
        int fn = f(n);

        // вывод n-ого по счёту числа Фибоначчи
        System.out.println("Число Фибоначчи " + n +  " по счету равно " + fn);
    }
}
