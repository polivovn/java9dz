package ru.netology.statistic;
public class Radio {
    public int currentStation;
    
    public int currentVolume;
    public int volume;

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }
    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }
    public void setStation(int station) {
        if (station >= 0 ) {
            currentStation = station;
        }
    }
    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}




