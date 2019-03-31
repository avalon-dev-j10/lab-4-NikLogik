/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.avalon.java.dev.j10.labs;

import java.util.Random;

/**
 *
 * @author java
 */
public class RandomString {
    
    private static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private int stringLength;
    private StringBuilder builder;
    private String newString;
    
    public RandomString(){
        setLengthString();
        newString = new String(createBuilder());
    }
    
    public StringBuilder createBuilder(){
        builder = new StringBuilder();
        builder.setLength(stringLength);
        for (int i = 0; i < builder.length(); i++) {
            builder.setCharAt(i, setRandomLetter()); 
        }
        return builder;
    }
    
    private void setLengthString(){
        Random rnd = new Random();
        stringLength = rnd.nextInt(10)+1;
    }
    
    private char setRandomLetter(){
        Random rd = new Random();
        int index = rd.nextInt(alphabet.length());
        char c = alphabet.charAt(index);
        return c;
    }

    public String getNewString() {
        return newString;
    }
    
    
    
    
}
