package com.jarod.shildt.lessons;

// Узнайте расстояние между стрелками часов циферблата в градусах.

public class CheckTime {

    public static void main(String[] args) {
        int hours = 10;
        int minutes = 40;

        double angleMinutes = minutes * (360 / 60);
        double angleHours = hours * (360 / 12) + 30 / (360 / angleMinutes);
        System.out.println( angleHours - angleMinutes);
    }
}




