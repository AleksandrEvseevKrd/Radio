package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    public void findNormalRadioStation() {

        rad.setCurrentRadioStation(5);
        assertEquals(5, rad.getCurrentRadioStation());
    }

    @Test
    public void findMinimumBorderRadioStation() {

        rad.setCurrentRadioStation(0);
        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void findLessMinimumBorderRadioStation() {

        rad.setCurrentRadioStation(-1);
        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void findMoreMinimumBorderRadioStation() {

        rad.setCurrentRadioStation(1);
        assertEquals(1, rad.getCurrentRadioStation());
    }

    @Test
    public void findMaximumBorderRadioStation() {

        rad.setCurrentRadioStation(9);
        assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    void findLessMaximumBorderRadioStation() {

        rad.setCurrentRadioStation(8);
        assertEquals(8, rad.getCurrentRadioStation());
    }

    @Test
    void findMoreMaximumBorderRadioStation() {

        rad.setCurrentRadioStation(10);
        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    void findNextRadioStation() {

        rad.setCurrentRadioStation(4);
        rad.setNextRadioStation();
        assertEquals(5, rad.getCurrentRadioStation());
    }

    @Test
    void findMinimumBorderNextRadioStation() {

        rad.setCurrentRadioStation(0);
        rad.setNextRadioStation();
        assertEquals(1, rad.getCurrentRadioStation());
    }

    @Test
    void findMoreMinimumBorderNextRadioStation() {

        rad.setCurrentRadioStation(1);
        rad.setNextRadioStation();
        assertEquals(2, rad.getCurrentRadioStation());
    }

    @Test
    void findMaximumBorderNextRadioStation() {

        rad.setCurrentRadioStation(9);
        rad.setNextRadioStation();
        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    void findLessMaximumBorderNextRadioStation() {

        rad.setCurrentRadioStation(9);
        rad.setNextRadioStation();
        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    void findPrevRadioStation() {

        rad.setCurrentRadioStation(5);
        rad.setPrevRadioStation();
        assertEquals(4, rad.getCurrentRadioStation());
    }

    @Test
    void findMinimumBorderPrevRadioStation() {

        rad.setCurrentRadioStation(0);
        rad.setPrevRadioStation();
        assertEquals(9, rad.getCurrentRadioStation());
    }

    @Test
    void findMoreMinimumBorderPrevRadioStation() {

        rad.setCurrentRadioStation(1);
        rad.setPrevRadioStation();
        assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    void findMaximumBorderPrevRadioStation() {

        rad.setCurrentRadioStation(9);
        rad.setPrevRadioStation();
        assertEquals(8, rad.getCurrentRadioStation());
    }

    @Test
    void findLessMaximumBorderPrevRadioStation() {

        rad.setCurrentRadioStation(8);
        rad.setPrevRadioStation();
        assertEquals(7, rad.getCurrentRadioStation());
    }

    @Test
    void findNormalSoundVolume() {

        rad.setCurrentSoundVolume(50);
        assertEquals(50, rad.getCurrentSoundVolume());
    }

    @Test
    void findMinimumBorderSoundVolume() {

        rad.setCurrentSoundVolume(0);
        assertEquals(0, rad.getCurrentSoundVolume());
    }

    @Test
    void findMoreMinimumBorderSoundVolume() {

        rad.setCurrentSoundVolume(1);
        assertEquals(1, rad.getCurrentSoundVolume());
    }

    @Test
    void findLessMinimumBorderSoundVolume() {

        rad.setCurrentSoundVolume(-1);
        assertEquals(0, rad.getCurrentSoundVolume());
    }

    @Test
    void findMaximumBorderSoundVolume() {

        rad.setCurrentSoundVolume(100);
        assertEquals(100, rad.getCurrentSoundVolume());
    }

    @Test
    void findLessMaximumBorderSoundVolume() {

        rad.setCurrentSoundVolume(99);
        assertEquals(99, rad.getCurrentSoundVolume());
    }

    @Test
    void findMoreMaximumBorderSoundVolume() {

        rad.setCurrentSoundVolume(101);
        assertEquals(0, rad.getCurrentSoundVolume());
    }

    @Test
    void findNormalIncreaseSoundVolume() {

        rad.setCurrentSoundVolume(50);
        rad.setIncreaseSoundVolume();
        assertEquals(51, rad.getCurrentSoundVolume());
    }

    @Test
    void findMaxIncreaseSoundVolume() {

        rad.setCurrentSoundVolume(100);
        rad.setIncreaseSoundVolume();
        assertEquals(100, rad.getCurrentSoundVolume());
    }

    @Test
    void findLessMaxIncreaseSoundVolume() {

        rad.setCurrentSoundVolume(99);
        rad.setIncreaseSoundVolume();
        assertEquals(100, rad.getCurrentSoundVolume());
    }

    @Test
    void findNormalDecreaseSoundVolume() {

        rad.setCurrentSoundVolume(50);
        rad.setDecreaseSoundVolume();
        assertEquals(49, rad.getCurrentSoundVolume());
    }

    @Test
    void findMinDecreaseSoundVolume() {

        rad.setCurrentSoundVolume(0);
        rad.setDecreaseSoundVolume();
        assertEquals(0, rad.getCurrentSoundVolume());
    }

    @Test
    void findMoreMinDecreaseSoundVolume() {

        rad.setCurrentSoundVolume(1);
        rad.setDecreaseSoundVolume();
        assertEquals(0, rad.getCurrentSoundVolume());
    }

    @Test
    void findMaxDecreaseSoundVolume() {

        rad.setCurrentSoundVolume(100);
        rad.setDecreaseSoundVolume();
        assertEquals(99, rad.getCurrentSoundVolume());
    }

    @Test
    void findLessMaxDecreaseSoundVolume() {

        rad.setCurrentSoundVolume(99);
        rad.setDecreaseSoundVolume();
        assertEquals(98, rad.getCurrentSoundVolume());
    }

}