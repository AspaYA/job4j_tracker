package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShopDropTest {

    @Test
    public void whenLeftShift0() {
        Product[] products = {new Product("Milk", 10), new Product("Bread", 4)};
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenLeftShift1() {
        Product[] products = {new Product("Milk", 10), new Product("Bread", 4)};
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }
}