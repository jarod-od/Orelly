package com.jarod.shildt.lessons;

 public class Vehicle {

     int passengers;  // количество пассажиров
     int fuelcup;     // емкость топливного бака
     int mpg;        // потребление топлива в милях на галлон
 }
    class VehicleTest{

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        int range; // расстояние
        int range2;

        if(minivan.equals(sportcar)){
            System.out.println("Вау!");
        }else {
            System.out.println("Пухляш пожирнее будет");
        }
        minivan.passengers = 6;
        minivan.fuelcup = 15;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcup = 11;
        sportcar.mpg = 18;

    // Расчет дальности поездки с полным баком горючего
        range = minivan.fuelcup * minivan.mpg;
        System.out.println("Минивен может перевезти " + minivan.passengers + " пассажиров на расстояние " + range + " миль");

        range2 = sportcar.fuelcup * sportcar.mpg;
        System.out.println("Спорткар может перевезти " + sportcar.passengers + " пассажиров на расстояние " + range2 + " миль");

    }
 }

