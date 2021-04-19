package ua.lviv.iot.military_unit;

import ua.lviv.iot.military_unit.manager.ArmamentManager;
import ua.lviv.iot.military_unit.manager.SortOrder;
import ua.lviv.iot.military_unit.models.*;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        Pistol glock = new Pistol("Good", Country.FRANCE, 300, "Scouting", 100, "7.62", "Glock-17");
        Tank tiger = new Tank( Country.CHINA, 750000, "Attack", 3000, 80, 2000, 1500, "Heavy");
        Drone falcon = new Drone(Country.ISRAEL, 2000, "Scouting", 0, 120, 5, 50, "67B");
        GhillieSuit ghost = new GhillieSuit(Country.GERMANY, 400, "Scouting", 10, CamouflageType.WOODLAND, new Cloth("Poliester", "High"));
        Knife kerambit = new Knife("Low", Country.FRANCE, 250, "Scouting", 20, KnifeType.KERAMBIT, "Small");

        List<Armament> arsenal = new ArrayList<>();
        arsenal.add(glock);
        arsenal.add(tiger);
        arsenal.add(falcon);
        arsenal.add(ghost);
        arsenal.add(kerambit);
        ArmamentManager manager = new ArmamentManager(arsenal);

        System.out.println("Before sorting");
        manager.printArsenal();

        System.out.println("After sorting by Price(DESC)");
        manager.sortByPrice(SortOrder.DESC);
        manager.printArsenal();

        System.out.println("After sorting by Mortality rate(ASC)");
        manager.sortByMortalityRate(SortOrder.ASC);
        manager.printArsenal();

        System.out.println("Searching items for Scouting");
        manager.searchByFunction("Scouting");
        manager.printArsenal();
    }
}
