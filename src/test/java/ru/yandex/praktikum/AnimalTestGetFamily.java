package ru.yandex.praktikum;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AnimalTestGetFamily {

    @Test
    public void shouldReturnAnimalFamily() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }
}
