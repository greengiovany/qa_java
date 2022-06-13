package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sexVariant;
    private final boolean expected;

    public LionTest(String sexVariant, boolean expected) {
        this.sexVariant = sexVariant;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getResult() {
        return new Object[][] {
            {"Самец", true},
            {"Самка", false}
        };
    }

    @Test
    public void shouldCheckSexLion() {
        Lion lion = Mockito.mock(Lion.class);
        Mockito.when(lion.doesHaveMane()).thenReturn(expected);
        Assert.assertEquals(expected, lion.doesHaveMane());
    }

    @Test
    public void shouldReturnKittensCount() {
        Lion lion = Mockito.mock(Lion.class);
        Mockito.when(lion.getKittens()).thenReturn(new Feline().getKittens());
        Assert.assertEquals(new Feline().getKittens(), lion.getKittens());
    }
}