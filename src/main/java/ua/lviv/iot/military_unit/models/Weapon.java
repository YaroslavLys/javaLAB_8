package ua.lviv.iot.military_unit.models;
import lombok.Data;

@Data
public class Weapon extends Armament {
    private String reliability;
    Weapon() {}
    Weapon(String reliability, Country originCountry, int price, String function, int mortalityRate) {
        super(originCountry, price, function, mortalityRate);
        this.reliability = reliability;
    }
}
