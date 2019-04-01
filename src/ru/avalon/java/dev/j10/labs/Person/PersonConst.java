package ru.avalon.java.dev.j10.labs.Person;

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
