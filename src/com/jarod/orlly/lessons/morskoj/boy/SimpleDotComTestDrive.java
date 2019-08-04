package com.jarod.orlly.lessons.morskoj.boy;

public class SimpleDotComTestDrive {
   public static void main(String [] args){

  SimpleDotCom dot = new SimpleDotCom();

// Создаем массив для местоположения сайта, три последовательных числа из семи
  int[] locations = {2, 3, 4};

//  Вызываем сеттер сайта
   dot.setLocationCells(locations);

//   Делаем ход от имени пользователя
  String userGuess = "2";

//  Вызываем метод объекта
  String result = dot.checkYourself(userGuess);
 }
}

