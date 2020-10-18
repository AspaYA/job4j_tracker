package ru.job4j.prof;

import java.time.LocalDate;

public class Programmer extends Engineer {

    private String lastCommit;

    public Programmer(String lastCommit){
        this("typeArea", "name", "surname", "education", null);
        this.lastCommit = lastCommit;
    }

    public Programmer(String typeArea, String name, String surname, String education, LocalDate birthday){
        super(typeArea, name, surname, education, birthday);
    }

}
