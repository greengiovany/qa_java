package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void shouldGaveException() {
        String sexVariant = "Тест";
        List<String> expected = List.of("Трава", "Различные растения");

        try {
            Lion lion = new Lion(sexVariant, feline);
            List<String> actual = lion.getFood();
            Assert.assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }

}
