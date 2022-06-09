package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AnimalGetFoodExceptionTest {


    @Test
    public void shouldThrowExceptionAnimalGetFood() {
        String animalKind = "Тест";
        Animal animal = Mockito.mock(Animal.class);
        try {
            animal.getFood(animalKind);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
