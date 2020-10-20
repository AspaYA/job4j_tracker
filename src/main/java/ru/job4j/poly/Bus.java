package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("go");
    }

    @Override
    public void passenger(int count) {
        System.out.println("passenger");
    }

    @Override
    public double fill(int volume) {
        return volume * 50.3;
    }
}
