package com.jarod.shildt.lessons;

public class PowerOfTwo2 {
    public static void main(String[] args) {
        // Вычисление целых степеней числа 2
        int e;
        int result;

        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 в степени " + i +
                    " равно " + result);
        }
    }
}
