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
        Animal animal = new Animal();
        //Animal animal = Mockito.mock(Animal.class);
        try {
            animal.getFood(animalKind);
        } catch (Exception e) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }

    }
}
