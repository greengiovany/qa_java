package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class LionGetKittensClass {
    @Mock
    Lion lion;

    @Test
    public void shouldCheckCountLion() {
        int expected = 1;
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);

    }
}
