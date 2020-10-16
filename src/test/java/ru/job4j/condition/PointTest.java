package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistance3dThen2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 0);
        assertThat(a.distance3d(b), is(2.0));
    }

    @Test
    public void whenDistance3dThen3() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 3);
        Assert.assertEquals(3.6, a.distance3d(b), 0.01);
    }

    @Test
    public void whenDistance3dThen6() {
        Point a = new Point(1, 4, 2);
        Point b = new Point(2, -1, 5);
        Assert.assertEquals(5.92, a.distance3d(b), 0.01);
    }
}