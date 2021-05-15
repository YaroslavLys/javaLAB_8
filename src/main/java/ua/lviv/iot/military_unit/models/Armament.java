package ua.lviv.iot.military_unit.models;


import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Armament {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Country originCountry;
    private int price;
    private String functionality;
    private int mortalityRate;

    public Armament() {
    }

    Armament(int id, String name, Country originCountry, int price, String functionality, int mortalityRate) {
        this.id = id;
        this.name = name;
        this.originCountry = originCountry;
        this.price = price;
        this.functionality = functionality;
        this.mortalityRate = mortalityRate;
    }


    Armament(Country originCountry, int price, String functionality, int mortalityRate) {
        this.originCountry = originCountry;
        this.price = price;
        this.functionality = functionality;
        this.mortalityRate = mortalityRate;
    }


}
