package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void findProperRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findMinimumBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findLessMinimumBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreMinimumBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreMaximumBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findLessMaximumBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);

        int actual = rad.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findMaximumBorderRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(4);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findMinimumBorderNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }


    @Test
    void findMoreMinimumBorderNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    void findMaximumBorderNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findLessMaximumBorderNextRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.next();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(4);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void findMinimumBorderPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreMinimumBorderPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMaximumBorderPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findLessMaximumBorderPrevRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.prev();

        int actual = rad.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void findCustomStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(5);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findMinimumBorderCustomStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMaxMinBorderCustomStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findMaximumBorderCustomStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void findMinMaxBorderCustomStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.customStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findNormalSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(5);

        int actual = rad.getCurrentSoundVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void findMinBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(0);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreMinimumBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void findLessMinimumBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(-1);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMaximumBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(100);

        int actual = rad.getCurrentSoundVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void findLessMaximumBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(99);

        int actual = rad.getCurrentSoundVolume();
        int expected = 99;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreMaximumBorderSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(101);

        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findNormalIncreaseSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(5);
        rad.increaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void findMaxIncreaseSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(100);
        rad.increaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void findLessMaxIncreaseSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(99);
        rad.increaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void findMinDecreaseSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(0);
        rad.decreaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void findMoreMinDecreaseSoundVolume() {
        Radio rad = new Radio();

        rad.setSoundVolume(1);
        rad.decreaseSoundVolume();


        int actual = rad.getCurrentSoundVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}