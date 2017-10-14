package com.arun.basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Adwiti on 10/12/2017.
 */
public class ComparatorUnderstanding {
    public static void main(String[] args) {

        List<Fruit> lstFruits = new ArrayList<>();
        lstFruits.add(new Fruit("Apple", "Red", "A"));
        lstFruits.add(new Fruit("Orange", "Orange", "C"));
        lstFruits.add(new Fruit("Banana", "Yellow", "D"));

        System.out.println(lstFruits);
        lstFruits.sort(Comparator.comparing(Fruit::getName));
        System.out.println(lstFruits);

        lstFruits.sort(Comparator.comparing(Fruit::getColor));
        System.out.println(lstFruits);

    }

}


class Fruit {
    private String name;
    private String color;
    private String type;

    public Fruit(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fruit{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}