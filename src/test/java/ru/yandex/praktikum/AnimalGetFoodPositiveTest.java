package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalGetFoodPositiveTest {

    private final String animalKind;
    private final List<String> expected;

    public AnimalGetFoodPositiveTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getResult() {
        return new Object[][] {
            {"Травоядное", List.of("Трава", "Различные растения")},
            {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void shouldReturnFood() throws Exception {
        Animal animal = new Animal();
            List<String> actual = animal.getFood(animalKind);
            Assert.assertEquals(expected, actual);
    }
}