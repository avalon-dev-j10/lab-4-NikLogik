/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.avalon.java.dev.j10.labs.Person;


import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author java
 */
public class GeneratorBirthDate {
    
    //объявляем переменные для хранения даты рождения
    private int year;
    private int dayOfYear;
    
    Random rnd = new Random();
    
    //создание произвольного числа в заданном диапазоне
    private int randomeItem(int a, int b){
        return rnd.nextInt(b-a)+a;
    }
    
    //присваивает произвольное значение года рождения
    public int setYear() {
        return year = randomeItem(1940, 2018);
    }
    
    //присваивает произвольный день в году рождения
    public int setDayOfYear() {
        int tmp = year%4;
        int maxDay;
        if (tmp==0) {maxDay = 366;}
        else maxDay = 365;
        dayOfYear = randomeItem(1, maxDay);
        return dayOfYear;
    }
    
}
