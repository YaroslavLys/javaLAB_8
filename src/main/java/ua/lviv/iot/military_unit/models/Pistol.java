package ua.lviv.iot.military_unit.models;
import lombok.Data;

@Data
public class Pistol extends Weapon {
    private String caliber;
    private String name;
    public Pistol(String reliability, Country originCountry, int price,
                  String function, int mortalityRate, String caliber, String name) {
        super(reliability, originCountry, price, function, mortalityRate);
        this.caliber = caliber;
        this.name = name;
    }
}
