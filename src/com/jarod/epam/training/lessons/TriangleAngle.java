package com.jarod.epam.training.lessons;

/*
 * Даны два угла треугольника (в градусах).
 * Определить, существует ли такой треугольник, и если да, то будет ли  он прямоугольным.
 */

import java.util.Scanner;

public class TriangleAngle {
        public static void main(String[] args){
            int x = 0;
            int y = 0;

            while (true) {
                try {
                    System.out.println("Input x, y: ");
                    Scanner s = new Scanner(System.in);
                    x = s.nextInt();
                    y = s.nextInt();
                    System.out.println("x = " + x + " deg, y = " + y + " deg");
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input");
                }
            }
        if (x + y >= 180 || x <= 0 || y <= 0 ){
            System.out.println("Triangle does not exist");
        } else{
            System.out.println("Triangle exist");
        }
        if(x == 90 || y == 90 || x + y == 90){
            System.out.println("Triangle is right");
        }else{
            System.out.println("Triangle is not right");
        }
        }
}
