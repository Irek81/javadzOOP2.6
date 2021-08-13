package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest  {

//    @Test
//    public void shouldNotSetChanelOverMax () {
//        Radio radio = new Radio();
//        radio.setCurrentChanel(9);
//        int expected = radio.getCurrentChanel();
//        int actual = radio.getCurrentChanel();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldNotSetChanelUnderMin () {
//        Radio radio = new Radio();
//        radio.setCurrentChanel(0);
//        int expected = radio.getMaxChanel();
//        int actual = radio.getCurrentChanel();
//        assertEquals (expected, actual);
//    }

    @Test
    public void shouldSetNextChanel () {
        Radio radio = new Radio();
        radio.setNextChanel(5);
        int expected = radio.getCurrentChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChanel () {
        Radio radio = new Radio();
        radio.setPrevChanel(5);
        int expected = radio.getCurrentChanel();
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

//    @Test
//    public void shouldSetReduceVolume () {
//        Radio radio = new Radio();
//        radio.setReduceVolume();
//        int expected = radio.getCurrentVolume();
//        int actual = radio.getCurrentVolume();
//    }


}