package ru.yandex.praktikum;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTestGetFood extends TestCase {

    private final String animalVariant;
    private final List<String> expected;

    public AnimalTestGetFood(String animalVariant, List<String> expected) {
        this.animalVariant = animalVariant;
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
            List<String> actual = animal.getFood(animalVariant);
            assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }

    }
}