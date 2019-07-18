package com.jarod.shildt.lessons;

 public class Vehicle {

     int passengers;  // количество пассажиров
     int fuelcup;     // емкость топливного бака
     int mpg;        // потребление топлива в милях на галлон

     //Определение дальности поездки транспортного средства
     int range (){
        return mpg * fuelcup;
     }

     // Расчет количества топлива, необходимого транспортному средству для преодоления заданного расстояния
     double fuelneeded (int miles){
         return (double) miles / mpg;
     }
 }
    class VehicleTest{

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        double gallons;
        int distance = 252;

        minivan.passengers = 6;
        minivan.fuelcup = 15;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcup = 11;
        sportcar.mpg = 12;

        gallons = minivan.fuelneeded(distance);
        System.out.println("Для преодоления " + distance + " миль, минивэну потребуется "
                + gallons + " галлонов топлива");

        gallons = sportcar.fuelneeded(distance);
        System.out.println("Для преодоления " + distance + " миль, спортачу потребуется "
                + gallons + " галлонов топлива");
    }
 }

