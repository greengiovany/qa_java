package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodExceptionTest {

    @Mock
    Feline feline;
    @Test
    public void shouldHaveExceptionLionGetFood() {
        Lion lion = Mockito.mock(Lion.class);
        try {
            lion.getFood();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}