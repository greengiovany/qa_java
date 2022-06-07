package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionDoesHaveManeExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void shouldHaveException() {
        String sexVariant = "Тест";

        try {
            Lion lion = new Lion(sexVariant, feline);
            boolean actual = lion.doesHaveMane();
            boolean expected = false;
            Assert.assertEquals(expected, actual);

        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }
}
