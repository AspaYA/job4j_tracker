package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        System.out.println("введите вопрос.");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        int answer = new Random().nextInt(3);
        String resp = switch (answer) {
            case 0 -> "да";
            case 1 -> "нет";
            default -> "может быть";
        };
        System.out.println(resp);
    }
}
