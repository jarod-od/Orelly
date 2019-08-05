package com.jarod.orlly.lessons;

public class LoopFor {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++){
            System.out.print (i + " ");
        }
        System.out.print("Done! ");

        int i = 0;
        while (i < 8){
            System.out.print(" " + i );
            i++;
        }
        System.out.print(" Done!");
        System.out.println("-------");

        String [] nameArray = {"Buv", "Duv", "Maruv"};

        for(String name : nameArray){
            System.out.println(name);
        }
    }
}
