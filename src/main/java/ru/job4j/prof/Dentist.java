package ru.job4j.prof;

import java.time.LocalDate;

public class Dentist extends Doctor {

    private int removeTooth;

    private void  addRemoveTooth(Dentist entety) {
    }

    public Dentist(int removeTooth) {
        this("stage", "name", "surname", "education", null);
        this.removeTooth = removeTooth;
    }

    public Dentist(String stage, String name, String surname, String education, LocalDate birthday) {
        super(stage, name, surname, education, birthday);
    }
}
