package com.jarod.shildt.lessons;

public class LoopsFight {
    // Подсчет пробелов
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        int spaces = 0;
        System.out.println("Для остановки введите символ точки.");
        do {
            ch = (char) System.in.read() ;
            if(ch == ' ') spaces++;
        } while(ch != '.');
        System.out.println("Пробелов: " + spaces);
//        for (int i = 0; i < 10; i++) {
        }
    }


