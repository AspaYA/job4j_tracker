package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра: 11 спичек");
        int unit = 11;
        int cnt = 0;
        int user = 1;
        while (unit > 0) {
            user = ((cnt % 2) + 1);
            System.out.println();
            System.out.print("игрок: " + user + " введите колличество спичек: ");
            int item = Integer.valueOf(scanner.nextLine());
            if (item < 1 || item > 3 || ((unit - item) < 0)) {
                System.out.println("Ошибка! указано недопустимое число");
                continue;
            }
            cnt++;
            unit -= item;
            System.out.println("на столе осталось: " + unit + " спичек;");
        }
        System.out.println();
        System.out.println("Игрок: " + user + " победил");
    }
}
