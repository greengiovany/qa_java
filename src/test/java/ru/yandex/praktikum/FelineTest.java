package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {
    Feline feline = new Feline();
    @Test
    public void shouldReturnFelineFamily() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFoodTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckException() {
        Assert.assertThrows(Exception.class, () -> feline.getFood("Тест"));
    }
}