package ru.job4j.prof;

import java.time.LocalDate;

public class Doctor extends Profession {

    private String stage;

    public Doctor() {
        this("name", "surname", "education", null);
        this.stage = "none";
    }

    public Doctor(String name, String surname, String education, LocalDate birthday) {
        super(name, surname, education, birthday);
    }

    public Doctor(String stage,  String name, String surname, String education, LocalDate birthday) {
        this(name, surname, education, birthday);
        this.stage = "none";
    }

}
