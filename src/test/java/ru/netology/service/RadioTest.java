package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldChangeToTheNextStationLowestValue() {
        Radio nextButton = new Radio();
        nextButton.setCurrentStation(0);

        nextButton.next();

        int expected = 1;
        int actual = nextButton.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 1.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheNextStationHighestValue() {
        Radio nextButton = new Radio();
        nextButton.setCurrentStation(9);

        nextButton.next();

        int expected = 0;
        int actual = nextButton.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 2.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheNextStationBorderValue() {
        Radio nextButton = new Radio();
        nextButton.setCurrentStation(8);

        nextButton.next();

        int expected = 9;
        int actual = nextButton.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 3.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheConcreteStationLowestBorder() {
        Radio stationNumber = new Radio();

        stationNumber.setCurrentStation(0);

        int expected = 0;
        int actual = stationNumber.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 4.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheConcreteStationHighestBorder() {
        Radio stationNumber = new Radio();

        stationNumber.setCurrentStation(9);

        int expected = 9;
        int actual = stationNumber.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 5.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheConcreteStationInvalidValue() {
        Radio stationNumber = new Radio();

        stationNumber.setCurrentStation(10);

        int expected = 0;
        int actual = stationNumber.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 6.1");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToTheConcreteStationInvalidNegativeValue() {
        Radio stationNumber = new Radio();

        stationNumber.setCurrentStation(-1);

        int expected = 0;
        int actual = stationNumber.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 6.2");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }


    @Test
    public void shouldChangeToThePrevStationLowestValue() {
        Radio prevButton = new Radio();
        prevButton.setCurrentStation(0);

        prevButton.prev();

        int expected = 9;
        int actual = prevButton.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 7.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToThePrevStationHighestValue() {
        Radio prevButton = new Radio();
        prevButton.setCurrentStation(9);

        prevButton.prev();

        int expected = 8;
        int actual = prevButton.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 8.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeToThePrevStationBorderValue() {
        Radio prevButton = new Radio();
        prevButton.setCurrentStation(1);

        prevButton.prev();

        int expected = 0;
        int actual = prevButton.getCurrentStation();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 9.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }


    @Test
    public void shouldChangeVolumeToTheUpperLimit() {
        Radio volumeUpButton = new Radio();
        volumeUpButton.setCurrentVolume(99);

        volumeUpButton.increaseVolume();

        int expected = 100;
        int actual = volumeUpButton.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 10.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeVolumeAboveTheUpperLimit() {
        Radio volumeUpButton = new Radio();
        volumeUpButton.setCurrentVolume(100);

        volumeUpButton.increaseVolume();

        int expected = 100;
        int actual = volumeUpButton.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 11.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeVolumeToTheBottomLimit() {
        Radio volumeDownButton = new Radio();
        volumeDownButton.setCurrentVolume(1);

        volumeDownButton.decreaseVolume();

        int expected = 0;
        int actual = volumeDownButton.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 12.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }

    @Test
    public void shouldChangeVolumeBeyondTheBottomLimit() {
        Radio volumeDownButton = new Radio();
        volumeDownButton.setCurrentVolume(0);

        volumeDownButton.decreaseVolume();

        int expected = 0;
        int actual = volumeDownButton.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

        System.out.println("Test 13.");
        System.out.println("Ожидаемое: " + expected + " Фактическое: " + actual);
        System.out.println();

    }


}
