package ru.job4j.poly;

public interface Transport {
    void go();

    void passenger(int count);

    double  fill(int volume);
}
