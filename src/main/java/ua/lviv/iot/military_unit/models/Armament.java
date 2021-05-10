package ua.lviv.iot.military_unit.models;

import lombok.Data;

import java.util.Objects;

@Data
public class Armament {

    private int id;
    private String name;
    private Country originCountry;
    private int price;
    private String function;
    private int mortalityRate;

    Armament() {
    }

    public Armament(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Armament(Country originCountry, int price, String function, int mortalityRate) {
        this.originCountry = originCountry;
        this.price = price;
        this.function = function;
        this.mortalityRate = mortalityRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Armament)) {
            return false;
        }
        Armament armament = (Armament) o;
        return Objects.equals(id, armament.id) && Objects.equals(name, armament.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toJson() {
        return String.format("{\"id\":%d,\"name\":\"%s\"}", id, name);
    }


}
