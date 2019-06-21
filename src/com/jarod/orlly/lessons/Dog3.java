package com.jarod.orlly.lessons;

public class Dog3 {
    String name;
    int size;
    public static void main(String[] args) {
        Dog3[] myDog = new Dog3[4];
        myDog[0] = new Dog3();
        myDog[0].name = "Jarod";
        myDog[0].size = 35;

        myDog[3] = new Dog3();
        myDog[3].name = "Dandy";
        myDog[3].size = 30;

        System.out.println("Собакен " + myDog[0].name + " весит " + myDog[0].size + " кило");
    }

}
