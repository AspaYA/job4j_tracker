package ru.job4j.prof;

import java.time.LocalDate;

public class Engineer extends Profession {

    private String typeArea;

    public Engineer(String typeArea, String name, String surname, String education, LocalDate birthday){
        super(name, surname, education, birthday);
        this.typeArea = typeArea;
    }
}
