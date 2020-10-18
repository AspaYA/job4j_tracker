package ru.job4j.prof;

import java.time.LocalDate;

public class Doctor extends Profession {

    private String stage;

    public Doctor(String stage, String name, String surname, String education, LocalDate birthday){
        super(name, surname, education, birthday);
        this.stage = stage;
    }
}
