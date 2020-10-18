package ru.job4j.prof;

import java.time.LocalDate;

public class Builder extends Engineer {

    private String endBuild;

    public Builder(String endBuild, String typeArea, String name, String surname, String education, LocalDate birthday){
        super(typeArea, name, surname, education, birthday);
        this.endBuild = endBuild;
    }


}
