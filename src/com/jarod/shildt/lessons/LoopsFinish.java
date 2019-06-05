package com.jarod.shildt.lessons;

public class LoopsFinish {
    /*
    Использование цикла for для формирования
    геометрической прогрессии:
            1, 2, 4, 8, 16, 32...
            */
    public static void main(String args[]) {

        for (int i = 1; i < 100; i += i)
            System.out.print(i + " ");

//        interesting output
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if ((i % 2) == 0) continue;
            System.out.println();
        }
    }
}


