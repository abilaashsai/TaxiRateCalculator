package com.twassignment.RateCalculator;

//Fares for each type of Taxi
class Price {
    private double baseFare;
    private double peakFare;
    private double perKmFare;


    void micro() {
        baseFare = 40;
        peakFare = 1.5;
        perKmFare = 6;
    }

    void mini() {
        baseFare = 80;
        peakFare = 2.0;
        perKmFare = 10;
    }

    void prime() {
        baseFare = 100;
        peakFare = 2.5;
        perKmFare = 13;
    }

    double getBaseFare() {
        return baseFare;
    }

    double getPeakFare() {
        return peakFare;
    }

    double getPerKmFare() {
        return perKmFare;
    }

}
