package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnimalGetFoodExceptionTest {

    @Mock
    Animal animal;

    @Test
    public void test() throws Exception {
        String animalKind = "Тест";
        try {
            animal.getFood(animalKind);
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}
