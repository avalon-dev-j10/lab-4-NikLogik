/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author nikitorches
 */
public class Sorted implements Sort{

    @Override
    //сортировка массива стандартным методом
    public void sort(Object[] array) {
        if (array!=null && array.length!=0) {
            Arrays.sort(array);
        }
    }

    @Override
    //сортировка объектов пузырьковым методом
    public void sort(Comparable[] array) {
        if (array!=null || array.length>0) {            
            boolean sorted = false;        
            Comparable c;
            
            while(!sorted){                 
                sorted = true;
                for(int i = 0; i < array.length-1; i++) {  
                    int temp = array[i].compareTo(array[i+1]);
                    if(temp>0){                
                        sorted=false;                       
                                                        
                        c = array[i];                    
                        array[i] = array[i+1];
                        array[i+1] = c;
                    }
                }
            }
        }
    }

    @Override
    //сортировка массива в обратном порядке пузырьковым методом с использованием компаратора
    public void sort(Object[] array, Comparator comparator) {
        if (array!=null || array.length>0) {            
            boolean sorted = false;
            Object temp;
            
            while(!sorted){                 
                sorted = true;
                for(int i = 0; i < array.length-1; i++) {  
                    int dif = comparator.compare(array[i], array[i+1]);
                    if(dif>0){                
                        sorted=false;                       
                                                        
                        temp = array[i];                    
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }
                }
            }
        }
    }
    
}
