package ru.yandex.praktikum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineGetKittensTest {

    @Test
    public void shouldReturnOneKitten() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCountKitten() {
        Feline feline = new Feline();
        int expected = 5;
        int count = 5;
        int actual = feline.getKittens(count);
        assertEquals(expected, actual);
    }
}
