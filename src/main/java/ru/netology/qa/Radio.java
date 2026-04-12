package ru.netology.qa;

public class Radio {
    private int currentStation;
    private int currentVolume;

    // комментарии созданы что бы просто не потеряться

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // комментарии созданы что бы просто не потеряться

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

    // комментарии созданы что бы просто не потеряться

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    // комментарии созданы что бы просто не потеряться

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    // комментарии созданы что бы просто не потеряться

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}