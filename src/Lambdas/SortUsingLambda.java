package Lambdas;

import BehaviourParameterization.Apple;
import BehaviourParameterization.AppleUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingLambda {
    public static void main(String[] args) {

        List<Apple> apples = AppleUtil.getListOfApple();
        //System.out.println(Collections.sort(apples)); //this wont work.

        //before Java 8
        Comparator<Apple> applesSortedBasedOnWeigh = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeigh() - o2.getWeigh();
            }
        };

        Collections.sort(apples, applesSortedBasedOnWeigh);
        System.out.println("Apples Sorted based on Weigh " + apples);

        //java8 way
        Comparator<Apple> applesBasedOnColor = (Apple a1, Apple a2) -> a1.getColor().compareTo(a2.getColor());
        Collections.sort(apples, applesBasedOnColor);
        System.out.println("Sorting based on color "+apples);
    }


}
