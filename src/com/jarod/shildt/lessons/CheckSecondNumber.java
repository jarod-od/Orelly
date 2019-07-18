package com.jarod.shildt.lessons;

public class CheckSecondNumber {
    //метод isFactor (),который определяет, является ли первый его параметр делителем второго.

    boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        else return false;
    }
}
    class CheckSecondNumberTest{
        public static void main (String[] args){
            CheckSecondNumber v = new CheckSecondNumber();

            if (v.isFactor(2,20)) {
                System.out.println(" 2 - делитель");
            }
            if (v.isFactor (3, 20)){
                System.out.println(" 3 - делитель");
            }
        }
    }

