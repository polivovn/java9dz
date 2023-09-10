package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.next();
        int expected = 1;
                int actual =  radio.currentStation;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.prev();
        int expected = 9;
        int actual =radio.currentStation;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSetStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        int expected = 5;
        int actual =radio.currentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.volume;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual =radio.volume;
        Assertions.assertEquals(expected,actual);
    }
}
