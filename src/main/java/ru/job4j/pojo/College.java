package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alex");
        student.setMiddleName("Ivanovich");
        student.setSurname("Shpack");
        student.setGroup("a1");
        student.setReceiptDate(new Date());
        System.out.println("student: "
                + student.getSurname() + " "
                + student.getName() + " "
                + student.getMiddleName() + "; "
                + "group: " + student.getGroup() + "; "
                + "ReceiptDate: " + new SimpleDateFormat("dd.MM.yyyy").format(student.getReceiptDate()) + "; "
        );
    }
}
