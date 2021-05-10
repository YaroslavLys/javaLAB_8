package ua.lviv.iot.military_unit.models;

import lombok.Data;

@Data
public class Cloth {
    private String name;
    private String elasticity;

    public Cloth(String name, String elasticity) {
        this.name = name;
        this.elasticity = elasticity;
    }
}
