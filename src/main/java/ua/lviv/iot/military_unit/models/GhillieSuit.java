package ua.lviv.iot.military_unit.models;

import lombok.Data;

@Data
public class GhillieSuit extends Armament {
    private CamouflageType type;
    private Cloth cloth;

    public GhillieSuit(Country originCountry, int price, String function,
                       int mortalityRate, CamouflageType type, Cloth cloth) {
        super(originCountry, price, function, mortalityRate);
        this.type = type;
        this.cloth = cloth;
    }

}
