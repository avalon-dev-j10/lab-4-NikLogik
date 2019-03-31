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
public class PersonCreator implements Person{
    
    private String name;
    private LocalDate birthDate;
    private PersonConst pc;
    
    Random rnd = new Random();

    public PersonCreator() {
        setName();
        setBirthDate();
    }
    
    
    
    private String setName(){
        int numberPerson = rnd.nextInt(5);
        switch(numberPerson){
            case 0:
                return name = pc.Nikita.getName();
            case 1:
                return name = pc.Jhon.getName();
            case 2:
                return name = pc.Thomas.getName();
            case 3:
                return name = pc.Anton.getName();
            case 4:
                return name = pc.Ellis.getName();
            default:
                return name = pc.NoName.getName();
        }
    }

    public LocalDate setBirthDate() {
        GeneratorBirthDate generator = new GeneratorBirthDate();
        LocalDate date = LocalDate.ofYearDay(generator.setYear(), generator.setDayOfYear());
        return birthDate = date;
        
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }
    
    public Person getInstance(){
        return new PersonCreator();
    }
}
