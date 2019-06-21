package com.jarod.orlly.lessons;

public class Dog2 {
     String name;
     int size;

    public static void main(String[] args) {
        Dog2 [] myDog = new Dog2[4];
        myDog[0] = new Dog2();
        myDog[0].name = "Jarod";
        myDog[0].size = 35;

        myDog[4] = new Dog2();
        myDog[4].name = "Dandy";
        myDog[4].size = 30;

    }

}
