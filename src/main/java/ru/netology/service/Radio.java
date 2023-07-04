package ru.netology.service;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxNumberOfStations = 10;

    private int lowestVolume = 0;
    private int highestVolume = 100;

    public Radio (int maxNumberOfStations) {
        this.maxNumberOfStations = maxNumberOfStations;
    }

    public Radio () {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation <= maxNumberOfStations - 1) {
                this.currentStation = currentStation;
            }
        }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void next() {

        if (currentStation < maxNumberOfStations - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {

        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxNumberOfStations - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < highestVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > lowestVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}
