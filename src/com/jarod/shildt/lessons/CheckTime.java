package com.jarod.shildt.lessons;

// Узнайте расстояние между стрелками часов циферблата в градусах.

public class CheckTime {
    int min;
    int hours;
    double degree;
}
    class CheckTimeTest{
    public static void main(String[] args) {
    CheckTime ch = new CheckTime();

    ch.min =15;
    ch.hours =3;
    ch.degree =360;

    double degreeMin = (360 / 60) * ch.min;
    double degreeHours = ((360 / 12)) * ch.hours;

    double degree = degreeHours - degreeMin;

        System.out.println("Если выбранное время " + ch.hours + ":" + ch.min + ", то " +
                "угол в градусах между стрелками часов будет - " + degree  );
    }
}
