package ru.yandex.praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void shouldReturnFelineFamily() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }
}