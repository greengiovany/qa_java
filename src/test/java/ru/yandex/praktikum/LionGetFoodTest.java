package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class LionGetFoodTest {
    @Test
    public void shouldCheckFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        Assert.assertEquals(expected, actual);
    }

}
