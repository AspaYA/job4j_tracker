package ru.job4j.prof;

import java.time.LocalDate;

public class Programmer extends Engineer {

    private String lastCommit;

    public Programmer(String lastCommit, String typeArea, String name, String surname, String education, LocalDate birthday){
        super(typeArea, name, surname, education, birthday);
        this.lastCommit = lastCommit;
    }
}
