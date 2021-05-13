package ua.lviv.iot.military_unit.models;
import lombok.Data;

@Data
public class Armament {
    private Country originCountry;
    private int price;
    private String function;
    private int mortalityRate;
    Armament() {}
    Armament(Country originCountry, int price, String function, int mortalityRate) {
        this.originCountry = originCountry;
        this.price = price;
        this.function = function;
        this.mortalityRate = mortalityRate;
    }
}
