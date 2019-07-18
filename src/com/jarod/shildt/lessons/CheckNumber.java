package com.jarod.shildt.lessons;

public class CheckNumber {
    //Метод isEven () возвращает логическое значение true, если значение, передаваемое при вызове этого метода, является
    //четным числом. В противном случае метод возвращает логическое значение false.

    boolean isEven (int x){
        if ((x%2) ==0)
            return true;
            else return false;
            }
        }
    class CheckNumberTest{
        public static void main (String[] args){
            CheckNumber v = new CheckNumber();
            if (v.isEven(10)){
                System.out.println("10 - четное число");
            }
            if (v.isEven (9)){
                System.out.println("9 - четное число");
            }
            if (v.isEven (8)){
                System.out.println("8 - четное число");
            }
        }

    }


