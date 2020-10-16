package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущая дата: " + currentDate);
        System.out.println("Текущее вермя: " + currentTime);
        System.out.println("Текущая дата/вермя: " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDTFormater = currentDateTime.format(formatter);
        System.out.println("Текущая дата/время после форматирования: " + currentDTFormater);

        String currentDTFormater1 = currentDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println("Текущая дата/время после форматирования: " + currentDTFormater1);
    }
}
