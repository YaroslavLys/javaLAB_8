package ua.lviv.iot.military_unit.models;

import lombok.Data;

@Data
public class Drone extends Machinery {
    private double range;
    private String model;

    public Drone(Country originCountry, int price, String function, int mortalityRate,
                 double maxSpeed, double weight, double range, String model) {
        super(originCountry, price, function, mortalityRate, maxSpeed, weight);
        this.range = range;
        this.model = model;
    }
}
