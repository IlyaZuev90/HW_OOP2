package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldChangeToTheNextStationLowestValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 1.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheNextStationHighestValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 2.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheNextStationBorderValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 3.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheConcreteStationLowestBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 4.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheConcreteStationHighestBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 5.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheConcreteStationInvalidValue() {
        Radio radio = new Radio(11);

        radio.setCurrentStation(10);

        int expected = 10;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 6.1.1");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheConcreteStationInvalidValueNegative() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 6.1.3");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheConcreteStationUpperLimitChanged() {
        Radio radio = new Radio(11);

        radio.setCurrentStation(10);

        int expected = 10;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 6.1.2");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheConcreteStationInvalidNegativeValue() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 6.2");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToThePrevStationLowestValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 7.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToThePrevStationHighestValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 8.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToThePrevStationBorderValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 9.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }


    @Test
    public void shouldChangeVolumeToTheUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 10.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeVolumeAboveTheUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 11.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeVolumeToTheBottomLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 12.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeVolumeBeyondTheBottomLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 13.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldCheckSettersCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 14.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();
    }

    @Test
    public void shouldCheckSettersLowestVolume() {
        Radio radio = new Radio();
        radio.setLowestVolume(10);
        int expected = 10;
        int actual = radio.getLowestVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 15.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();
    }

    @Test
    public void shouldCheckSettersHighestVolume() {
        Radio radio = new Radio();
        radio.setHighestVolume(70);
        int expected = 70;
        int actual = radio.getHighestVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 16.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();
    }

    @Test
    public void shouldCheckSettersMaxNumberOfStations() {
        Radio radio = new Radio();
        radio.setMaxNumberOfStations(99);
        int expected = 99;
        int actual = radio.getMaxNumberOfStations();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 17.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();
    }
}
