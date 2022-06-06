package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

    private final String animalKind;
    private final List<String> expected;

    public AnimalGetFoodTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getResult() {
        return new Object[][] {
            {"Травоядное", List.of("Трава", "Различные растения")},
            {"Хищник", List.of("Животные", "Птицы", "Рыба")},
            {"Тест", List.of("")}
        };
    }

    @Test
    public void shouldReturnFood() {
        Animal animal = new Animal();
        try {
            List<String> actual = animal.getFood(animalKind);
            Assert.assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}