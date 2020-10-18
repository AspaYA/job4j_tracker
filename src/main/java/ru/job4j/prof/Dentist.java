package ru.job4j.prof;

import java.time.LocalDate;

public class Dentist extends Doctor {

    private int removeTooth;

    private void  addRemoveTooth(Dentist entety){

    }

    public Dentist(int removeTooth, String stage, String name, String surname, String education, LocalDate birthday){
        super(stage, name, surname, education, birthday);
        this.removeTooth = removeTooth;
    }
}
