package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionDoesHaveManePositiveTest {

    Feline feline;
    private final String sexVariant;
    private final boolean expected;

    public LionDoesHaveManePositiveTest(String sexVariant, boolean expected) {
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
    public void shouldReturnSexLion() {
        try {
            Lion lion = new Lion(sexVariant, feline);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}
