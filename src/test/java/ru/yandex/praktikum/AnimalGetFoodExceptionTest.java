package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AnimalGetFoodExceptionTest {


    @Test
    public void test() {
        String animalKind = "Тест";
        Animal animal = new Animal();
        try {
            List<String> actual = animal.getFood(animalKind);
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }

    }
}
