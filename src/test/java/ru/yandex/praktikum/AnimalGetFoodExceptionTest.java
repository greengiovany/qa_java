package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnimalGetFoodExceptionTest {

    @Test
    public void shouldThrowExceptionAnimalGetFood() {
        Assert.assertThrows(Exception.class, () -> new Animal().getFood("тест"));

    }
}
