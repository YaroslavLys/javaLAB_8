package ua.lviv.iot.military_unit.models;
import lombok.Data;

@Data
public class Tank extends Machinery {
    private double fuelCapacity;
    private String type;
    public Tank(Country originCountry, int price, String function, int mortalityRate,
                double maxSpeed, double weight, double fuelCapacity, String type) {
        super(originCountry, price, function, mortalityRate, maxSpeed, weight);
        this.fuelCapacity = fuelCapacity;
        this.type = type;
    }
}
