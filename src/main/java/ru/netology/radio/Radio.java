package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int amountRadioStation = 10;
    private int minRadioStation;
    private int currentSoundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume;


    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
    }

    public Radio() {

    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > amountRadioStation - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation == amountRadioStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }


    public void setPrevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = amountRadioStation - 1;
        } else {
            currentRadioStation--;
        }
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume < minSoundVolume) {
            return;
        }
        if (currentSoundVolume > maxSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setIncreaseSoundVolume() {
        if (currentSoundVolume == maxSoundVolume) {
            return;
        }
        currentSoundVolume++;
    }

    public void setDecreaseSoundVolume() {
        if (currentSoundVolume == 0) {
            return;
        }
        currentSoundVolume--;
    }
}