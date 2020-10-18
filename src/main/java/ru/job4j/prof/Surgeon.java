package ru.job4j.prof;

import java.time.LocalDate;

public class Surgeon extends Doctor {

    private int killCase;

    private void  addKill(Surgeon entety){

    }

    public Surgeon(int killCase){
        this("stage", "name", "surname", "education", null);
        this.killCase = killCase;
    }

    public Surgeon(String stage, String name, String surname, String education, LocalDate birthday){
        super(stage, name, surname, education, birthday);
    }
}
