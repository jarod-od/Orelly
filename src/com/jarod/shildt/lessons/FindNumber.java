package com.jarod.shildt.lessons;

public class FindNumber {
    //     Напишите программу, которая находила бы все простые числа в диапазоне
//    от 2 до 100.
// Нахождение простых чисел в диапазоне от 2 до 100
    public static void main(String args[]) {
        int i, j;
        boolean isprime;
        for (i = 2; i < 100; i++) {
            isprime = true;
// Проверить, делится ли число без остатка
            for (j = 2; j <= i / j; j++)
// Если число делится без остатка, значит, оно не простое
                if ((i % j) == 0) isprime = false;
            if (isprime)
                System.out.println(i + " - простое число.");
        }
    }
}
