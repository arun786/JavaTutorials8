package com.arun.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Adwiti on 10/14/2017.
 */
public class ComparableUnderstanding {

    public static void main(String[] args) {

        List<Animals> lstanimals = new ArrayList<>();
        lstanimals.add(new Animals("Fox","brown","C",10));
        lstanimals.add(new Animals("Dox","brown","C",10));
        lstanimals.add(new Animals("Gox","brown","C",10));

        Collections.sort(lstanimals);
        System.out.println(lstanimals);

    }

}

class Animals implements Comparable<Animals>{
    private String name;
    private String color;
    private String type;
    private Integer age;

    public Animals(String name, String color, String type, Integer age) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Animals o) {
        return this.getName().compareTo(o.getName());
    }


}
