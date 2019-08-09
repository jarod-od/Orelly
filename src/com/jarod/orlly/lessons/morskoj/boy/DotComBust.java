package com.jarod.orlly.lessons.morskoj.boy;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private int numOfGuess = 0;

    private void setUpGame(){
// Create few sites and give them name
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("You're goal - to kill three ship");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to catch them by minimal shoots");

        for (DotCom dotComSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying(){
        while(!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numOfGuess++;
        String result = "Miss";

        for(DotCom dotComToSet : dotComList){
            result = dotComToSet.checkYourself(userGuess);
            if(result.equals("Hit")){
                break;
            }
            if(result.equals("Kill")){
                dotComList.remove(dotComToSet);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Dot Coms are dead! Your stock is now worthless");
        if(numOfGuess <= 18){
            System.out.println("It only took to you " + numOfGuess + " guess");
            System.out.println("You got out before your options sank.");
        }else {
            System.out.println("Took you long enough. " + numOfGuess + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

}