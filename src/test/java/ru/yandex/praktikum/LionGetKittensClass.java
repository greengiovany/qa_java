package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class LionGetKittensClass {
    @Mock
    Lion lion;

    @Test
    public void shouldCheckCountLion() throws Exception {
        int expected = 1;
//        Feline feline = new Feline();
//        Lion lion = new Lion(feline);
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);

    }
}
