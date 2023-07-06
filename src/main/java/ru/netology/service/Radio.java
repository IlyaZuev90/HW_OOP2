package ru.netology.service;

import lombok.*;

@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class Radio {
    @NonNull
    @Setter
    @Getter
    private int maxNumberOfStations;
    @Getter
    private
    int currentStation = 0;
    @Setter
    @Getter
    private
    int currentVolume = 0;
    @Setter
    @Getter
    private
    int lowestVolume = 0;
    @Setter
    @Getter
    private
    int highestVolume = 100;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxNumberOfStations - 1) {
            return;
        }
        this.currentStation = currentStation;
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
