package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void increaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        int expected = 99;
        conditioner.setMaxTemperature(100);
        conditioner.setCurrentTemperature(98);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected,conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureEqualMax(){
        Conditioner conditioner = new Conditioner();
        int expected = 100;
        conditioner.setMaxTemperature(100);
        conditioner.setCurrentTemperature(100);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected,conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        int expected = -10;
        conditioner.setMinTemperature(-15);
        conditioner.setCurrentTemperature(-9);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected,conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureEqualMin(){
        Conditioner conditioner = new Conditioner();
        int expected = -10;
        conditioner.setMinTemperature(-10);
        conditioner.setCurrentTemperature(-10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected,conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldSetCurrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(15);
        assertEquals(15,conditioner.getCurrentTemperature());
    }

    @Test
    public void SetCurrentTemperatureAboveMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(31);
        assertEquals(0,conditioner.getCurrentTemperature());
    }

    @Test
    public void SetCurrentTemperatureBelowMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(-10);
        assertEquals(0,conditioner.getCurrentTemperature());
    }
}