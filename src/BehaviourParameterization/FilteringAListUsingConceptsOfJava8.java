package BehaviourParameterization;

import java.util.ArrayList;
import java.util.List;

public class FilteringAListUsingConceptsOfJava8 {

    public static void main(String[] args) {

        System.out.println("Details of Apples with Red color");
        FilterAList(AppleUtil.getListOfApple(), new AppleWithRedColor());
        System.out.println("Details of Apples with Blue color");
        FilterAList(AppleUtil.getListOfApple(), new AppleWithBlueColor());
        System.out.println("Details of Apples from Burma");
        FilterAList(AppleUtil.getListOfApple(), new AppleFromBurma());
        System.out.println("Details of Apples with Red color and weighing more than 100");
        FilterAList(AppleUtil.getListOfApple(), new AppleWithRedAndHeavy());
    }

    public static void FilterAList(List<Apple> inventory, FilterApple p) {

        List<Apple> filter = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                filter.add(apple);
            }
        }
        System.out.println(filter);
    }
}


interface FilterApple {
    boolean test(Apple apple);
}

class AppleWithRedColor implements FilterApple {

    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}

class AppleWithBlueColor implements FilterApple {

    @Override
    public boolean test(Apple apple) {
        return "blue".equals(apple.getColor());
    }
}

class AppleFromBurma implements FilterApple {
    @Override
    public boolean test(Apple apple) {
        return "burma".equals(apple.getOrigin());
    }
}

class AppleWithRedAndHeavy implements FilterApple{
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeigh() > 100;
    }
}
