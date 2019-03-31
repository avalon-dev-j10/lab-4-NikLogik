/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.avalon.java.dev.j10.labs.Person;

/**
 *
 * @author java
 */
enum PersonConst {
    Nikita("Nikita"), Jhon("Jhon"), Thomas("Thomas"), Anton("Anton"), Ellis("Ellis"), NoName;
    
    String name;
    
    private PersonConst(){
        name = "No name";
    }

    private PersonConst(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
