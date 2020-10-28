package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        new Fact().calc(-5);
    }

    @Test
    public void when5then120() {
        int rsl = new Fact().calc(5);
        assertThat(rsl, is(120));
    }
}