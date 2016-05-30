package com.twassignment.RateCalculator;

import java.util.ArrayList;

//Provide approximate cost of travel
public class Taxi {
    private ArrayList<Fare> taxiList = new ArrayList<Fare>();

    public void inputCategorization(ArrayList<String> input) {
        for (int i = 0; i < input.size(); i++) {
            taxiList.add(parseString(input.get(i)));
        }
    }

    private Fare parseString(String input) {
        int numberOfTaxi;
        String type;
        Boolean peak;
        double distance;
        String[] tokens = input.split(" ");
        numberOfTaxi = Integer.parseInt(tokens[0]);
        if (input.contains("peak")) {
            peak = true;
        } else {
            peak = false;
        }
        if (input.contains("micro")) {
            type = "micro";
        } else if (input.contains("mini")) {
            type = "mini";
        } else {
            type = "prime";
        }
        distance = Double.parseDouble(tokens[tokens.length - 2]);
        Fare fare = new Fare(numberOfTaxi, type, peak, distance);
        return fare;
    }

    public double getFare() {
        for (Fare fare : taxiList) {
            return fare.calculate();
        }
        return -1;
    }

}
