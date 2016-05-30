package com.twassignment.RateCalculator;

//Calculate the Total Amount
class Fare {
    private int numberOfTaxi;
    private String type;
    private Boolean peak;
    private double distance;
    private double perKmFare;
    private double totalFare;
    Price price = new Price();

    Fare(int numberOfTaxi, String type, Boolean peak, double distance) {
        this.numberOfTaxi = numberOfTaxi;
        this.peak = peak;
        this.distance = distance;
        this.type = type;
        if (this.type == "micro") {
            price.micro();
        } else if (this.type == "mini") {
            price.mini();
        } else {
            price.prime();
        }
    }

    public double calculate() {
        totalFare = price.getBaseFare();
        perKmFare = price.getPerKmFare();
        if (peak) {
            perKmFare = price.getPerKmFare() + price.getPeakFare();
        }
        if ((distance - 4) <= 0) {
            return numberOfTaxi * totalFare;
        }
        return (numberOfTaxi * (distance - 4) * perKmFare) + totalFare;
    }

}
