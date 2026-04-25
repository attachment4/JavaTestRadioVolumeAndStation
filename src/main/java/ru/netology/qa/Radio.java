package ru.netology.qa;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation; // Новое поле для хранения количества станций

    // Конструктор по умолчанию (для 10 станций)
    public Radio() {
        this.maxStation = 9; // Индексы 0-9
    }

    // Конструктор с параметром (задаем количество станций)
    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {
        // Теперь сравниваем не с 9, а с maxStation
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        // Если на нуле, переходим на самую последнюю станцию (maxStation)
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

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

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}