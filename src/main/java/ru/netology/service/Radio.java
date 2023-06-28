package ru.netology.service;

public class Radio {
    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void next(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prev(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void setNewCurrentStation(int newCurrentStation) {

        if (newCurrentStation <= 9) {
            currentStation = newCurrentStation;
        } else {
            String s = String.format("%d", newCurrentStation);

            String r = String.valueOf(s.charAt(s.length() - 1));
            currentStation = Integer.parseInt(r);

        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
