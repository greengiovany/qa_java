package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionDoesHaveManeExceptionTest {

    @Mock
    Feline feline;

    @Test
    public void shouldThrowExpectedException() {
        Assert.assertThrows(Exception.class, () -> new Lion("test", feline));
    }
}
