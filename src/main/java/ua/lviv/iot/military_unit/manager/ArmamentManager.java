package ua.lviv.iot.military_unit.manager;

import ua.lviv.iot.military_unit.models.Armament;

import java.util.*;

import java.util.stream.Collectors;


public class ArmamentManager {
    private List<Armament> arsenal;

    public ArmamentManager(List<Armament> arsenal) {
        this.arsenal = arsenal;
    }

    public void printArsenal() {
        for (Armament item : arsenal) {
            System.out.println("---------");
            System.out.println(item);
            System.out.println("function: " + item.getFunction());
            System.out.println("price: " + item.getPrice());
            System.out.println("mortality rate: " + item.getMortalityRate());
            System.out.println("---------");
        }
    }

    public void sortByPrice(SortOrder order) {
        if (order == SortOrder.ASC) {
            this.arsenal.sort((firstItem, secondItem) ->
                    firstItem.getPrice() - secondItem.getPrice());
        } else {
            this.arsenal.sort((Armament firstItem, Armament secondItem) ->
                    secondItem.getPrice() - firstItem.getPrice());
        }
    }

    public void sortByMortalityRate(SortOrder order) {
        if (order == SortOrder.ASC) {
            this.arsenal.sort((firstItem, secondItem) ->
                    firstItem.getMortalityRate() - secondItem.getMortalityRate());
        } else {
            this.arsenal.sort((firstItem, secondItem) ->
                    secondItem.getMortalityRate() - firstItem.getMortalityRate());
        }
    }

    public void searchByFunction(String function) {
        arsenal = arsenal.stream().filter(item -> item.getFunction().equals(function)).collect(Collectors.toList());
    }
}
