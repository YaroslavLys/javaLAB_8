package ua.lviv.iot.military_unit.models;
import lombok.Data;

@Data
public class Knife extends Weapon {
    private KnifeType type;
    private String size;
    public Knife(String reliability, Country originCountry, int price,
                 String function, int mortalityRate, KnifeType type, String size) {
        super(reliability, originCountry, price, function, mortalityRate);
        this.type = type;
        this.size = size;
    }
}
