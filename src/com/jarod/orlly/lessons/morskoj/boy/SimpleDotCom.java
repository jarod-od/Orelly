package com.jarod.orlly.lessons.morskoj.boy;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells (int [] locs){
        locationCells = locs;
    }

    public String checkYourself (String stringGuess){

//        Преобразуем тип Стринг в Инт
        int guess = Integer.parseInt(stringGuess);

// Создаем переменную для хранения резултата, который будет возвращать.
// присваиваем строковое значение, подразумеваем промах
        String result = "Miss";

// Повторяем с каждой ячейкой массива locationCells(местоположение ячейки объекта)
        for (int cell : locationCells){

// Сравниваем ход пользователя с этим элементом (ячейкой)массива
            if (guess == cell){

// Мы обнаружили попадание
                result = "Catch!";
                numOfHits++;
                break; // выходим из цикла
            }
        }

// Мы вышли из цикла, но посмотрим не потопили ли нас(три попадания)
// и при необходимости изменим результат на Потопил
        if (numOfHits == locationCells.length){
            result = "Kill";
        }

// Выводим пользователю результат Мимо, если он не был изменен на Попал или Потопил
        System.out.println(result);
        return result; // возвращаем результат в вызывающий метод
    }
}
