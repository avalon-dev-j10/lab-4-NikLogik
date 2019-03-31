/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.Sort;

import java.util.Comparator;
import ru.avalon.java.dev.j10.labs.Person.Person;

/**
 *
 * @author nikitorches
 */
public class StringComparator implements Comparator<String>{

    @Override
    //
    public int compare(String o1, String o2) {
       return o2.compareTo(o1);
    }
}
