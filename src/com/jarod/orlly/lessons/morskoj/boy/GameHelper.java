package com.jarod.orlly.lessons.morskoj.boy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private int comCount = 0;
    private int gridLength = 7;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + "  ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public ArrayList<String> placeDotCom(int comSize) {                 // line 19
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String[comSize];      // holds 'f6' type coords
        String temp = null;                                // temporary String for concat
        int[] coords = new int[comSize];                  // current candidate coords
        int attempts = 0;                                  // current attempts counter
        boolean success = false;                           // flag = found a good location ?
        int location = 0;                                  // current starting location

        comCount++;                                        // nth dot com to place
        int incr = 1;                                      // set horizontal increment
        if ((comCount % 2) == 1) {                         // if odd dot com  (place vertically)
            incr = gridLength;                               // set vertical increment
        }
        return alphaCells;
    }
}

