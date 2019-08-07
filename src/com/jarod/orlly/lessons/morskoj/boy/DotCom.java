package com.jarod.orlly.lessons.morskoj.boy;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput){
        String result = "miss";

// Проверяем, содержится ли загаданная пользователем ячейка внутри ArrayList, запрашивая ее индекс
// Если ее нет в списке то indexOf()возвращает -1
        int index = locationCells.indexOf(userInput);

// Если индекс больше или равен нулю, то загаданная пользователем ячейка
// определенно находится в списке, по этому удаляем ее
        if (index >=0){
            locationCells.remove(index);

// Если список пустой, значит это было финальное попадание
            if(locationCells.isEmpty()){
                result = "Kill";
            } else {
                result = "Hit";
            }
        }
        return result;
    } // Конец метода
}
