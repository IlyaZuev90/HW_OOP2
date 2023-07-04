package ru.netology.service;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
//@Data
public class Radio {
    private @Setter @Getter int currentStation;
    private @Setter @Getter int currentVolume;
    private @Setter @Getter int maxNumberOfStations = 10;

    private @Setter @Getter int lowestVolume = 0;
    private @Setter @Getter int highestVolume = 100;

    public Radio(int maxNumberOfStations) {
        this.maxNumberOfStations = maxNumberOfStations;
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
