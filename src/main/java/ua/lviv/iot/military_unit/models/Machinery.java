package ua.lviv.iot.military_unit.models;

import lombok.Data;

@Data
public class Machinery extends Armament {
    private double maxSpeed;
    private double weight;

    Machinery() {
    }

    Machinery(Country originCountry, int price, String function, int mortalityRate, double maxSpeed, double weight) {
        super(originCountry, price, function, mortalityRate);
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }
}
