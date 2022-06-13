package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

@RunWith(Parameterized.class)
public class LionGetFoodPositiveTest {
    private final String sexVariant;
    private final List<String> expected;

    public LionGetFoodPositiveTest(String sexVariant, List<String> expected) {
        this.sexVariant = sexVariant;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getResult() {
        return new Object[][] {
                {"Самец", List.of("Животные", "Птицы", "Рыба")},
                {"Самка", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void shouldCheckFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(sexVariant, feline);
        Assert.assertEquals(expected, lion.getFood());
    }
}
