package BehaviourParameterization;

import java.util.ArrayList;
import java.util.List;


/*
Prior to Java 8
 */
public class FilteringFromAList {

    public static void FirstAttemptPassingListOfApple(List<Apple> inventory) {

        List<Apple> lstOfAppleWithRedColor = new ArrayList<>();


        for (Apple apple : inventory) {
            if (apple.getColor().equals("red")) {
                lstOfAppleWithRedColor.add(apple);
            }
        }

        System.out.println(lstOfAppleWithRedColor);
    }

    public static void SecondAttemptPassColor(List<Apple> inventory, String color){
        List<Apple> lstOfApple = new ArrayList<>();


        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                lstOfApple.add(apple);
            }
        }

        System.out.println(lstOfApple);
    }


    public static void main(String[] args) {

        List<Apple> lstApple = AppleUtil.getListOfApple();
        FilteringFromAList.FirstAttemptPassingListOfApple(lstApple);
        System.out.println("If we pass the color");
        FilteringFromAList.SecondAttemptPassColor(lstApple,"green");
    }
}
