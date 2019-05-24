package com.jarod.shildt.lessons;

public class PutIn {
    // Чтение символа с клавиатуры
        public static void main(String args[])
                throws java.io.IOException {
            char ch;
            System.out.print("Нажмите нужную клавишу, а затем клавишу ENTER: ");
            ch = (char) System.in.read() ; // получить символа
            System.out.println("Вы нажали клавишу " + ch) ;
        }
}
