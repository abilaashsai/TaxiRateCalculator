package com.twassignment.RateCalculator;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTaxi {

    @Test
    public void getFareReturns1504WhenParsing1MicroFor248Km() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1 micro for 248 km");
        Taxi taxi = new Taxi();
        taxi.inputCategorization(arrayList);
        assertEquals(1504, taxi.getFare(), 0.1);
    }

    @Test
    public void getFareReturns286WhenParsing2PrimeFor10Km() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("2 prime at peak time for 10 km");
        Taxi taxi = new Taxi();
        taxi.inputCategorization(arrayList);
        assertEquals(286, taxi.getFare(), 0.1);
    }

    @Test
    public void getFareReturns80WhenParsing1MiniFor2Km() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1 mini for 2 km");
        Taxi taxi = new Taxi();
        taxi.inputCategorization(arrayList);
        assertEquals(80, taxi.getFare(), 0.1);
    }

}
