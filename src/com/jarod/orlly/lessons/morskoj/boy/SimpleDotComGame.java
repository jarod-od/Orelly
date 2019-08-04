package com.jarod.orlly.lessons.morskoj.boy;

public class SimpleDotComGame {

    public static void main(String[] args) {

// Создаем переменную, что бы следить за количеством ходов пользователя
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper(); // спец класс

        SimpleDotCom theDotCom = new SimpleDotCom();

// Генерим случайное число для первой ячейки и юзаем его для формирования массива ячеек
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};

// Передаем сайту местоположение его ячеек (массив)
        theDotCom.setLocationCells(locations);

// Создаем булеву переменную, что бы проверять в цикле, не закончилась ли игра
        boolean isAlive = true;
        while (isAlive == true)
        {
            String guess = helper.getUserInput("enter a number");// юзер вводит

// Просим сайт проверить полученные данные, сохраняем резалт в переменную типа стринг
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;// инкрементим количество попыток

// Потоплен ли сайт? Если да, то присваиваем isAlive = false, т.к. не хотим продолжать цикл
// и выводим на экран количество попыток
            if (result.equals("Kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
