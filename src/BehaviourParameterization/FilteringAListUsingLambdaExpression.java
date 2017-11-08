package BehaviourParameterization;

import java.util.ArrayList;
import java.util.List;

public class FilteringAListUsingLambdaExpression {


    public static void main(String[] args) {

        List<Apple> inventory = AppleUtil.getListOfApple();
        System.out.println("List Of Red Apples " +  filterApple(inventory, (Apple apple) -> "red".equals(apple.getColor())));
        System.out.println("List of light red Apples " + filterApple(inventory, (Apple apple) -> "red".equals(apple.getColor()) && apple.getWeigh() < 100));

    }

    public static List<Apple> filterApple(List<Apple> inventory, APredicate p) {
        List<Apple> filteredAppleList = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                filteredAppleList.add(apple);
            }
        }
        return filteredAppleList;
    }
}

interface APredicate {
    boolean test(Apple apple);
}
