package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;

public class LionGetKittensClass {

    @Test
    public void shouldCheckCountLion() {
        int expected = 1;
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);

    }
}
