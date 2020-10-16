package ru.job4j.calculator;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return add(add(a, b), c);
    }
}
