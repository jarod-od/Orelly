package com.jarod.orlly.lessons;

import java.util.ArrayList;

public class LoopFor {

    LoopFor list = new LoopFor();

    ArrayList <String> scope =  new ArrayList<>();

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
