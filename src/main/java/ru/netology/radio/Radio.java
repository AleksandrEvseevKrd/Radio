package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void next() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
        return;
    }

    public void prev() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
        return;
    }

    public void customStation() {
        int newCurrentRadioStation = getCurrentRadioStation();
        setCurrentRadioStation(newCurrentRadioStation);
    }

    public void setSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < 0) {
            return;
        }
        if (currentSoundVolume > 100) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume >= 100) {
            currentSoundVolume = 100;
        } else {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume <= 0) {
            currentSoundVolume = 0;
        } else {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }
}