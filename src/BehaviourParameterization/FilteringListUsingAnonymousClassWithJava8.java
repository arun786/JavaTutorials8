package BehaviourParameterization;

import java.util.ArrayList;
import java.util.List;

public class FilteringListUsingAnonymousClassWithJava8 {

    public static void main(String[] args) {

            List<Apple> inventory = AppleUtil.getListOfApple();
            List<Apple> redApple = FilterApple(inventory, new ApplePredicate() {
                @Override
                public boolean test(Apple apple) {
                    return "red".equals(apple.getColor());
                }
            });

        System.out.println(redApple);

    }


    public static List<Apple> FilterApple(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> filteredApple = new ArrayList<>();
        for(Apple apple : inventory){
            if(predicate.test(apple)){
                filteredApple.add(apple);
            }
        }
        return filteredApple;
    }
}

interface ApplePredicate {
    boolean test(Apple apple);
}


