package com.jarod.shildt.lessons;

 public class Vehicle {

     int passengers;  // количество пассажиров
     int fuelcup;     // емкость топливного бака
     int mpg;        // потребление топлива в милях на галлон

     // Это конструктор класса Vehicle
     Vehicle(int p, int f, int m){
          passengers = p;
          fuelcup = f;
          mpg = m;
     }

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

        Vehicle minivan = new Vehicle(6, 15, 21);
        Vehicle sportcar = new Vehicle(2, 11, 12);
        double gallons;
        int distance = 252;

        gallons = minivan.fuelneeded(distance);
        System.out.println("Для преодоления " + distance + " миль, минивэну потребуется "
                + gallons + " галлонов топлива");

        gallons = sportcar.fuelneeded(distance);
        System.out.println("Для преодоления " + distance + " миль, спортачу потребуется "
                + gallons + " галлонов топлива");
    }
 }

