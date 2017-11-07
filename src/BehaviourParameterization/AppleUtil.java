package BehaviourParameterization;

import java.util.ArrayList;
import java.util.List;

public class AppleUtil {

    public static List<Apple> getListOfApple() {
        List<Apple> lstApple = new ArrayList<>();
        lstApple.add(new Apple("red", "150", "india"));
        lstApple.add(new Apple("green", "15", "pakistan"));
        lstApple.add(new Apple("red", "100", "bangladesh"));
        lstApple.add(new Apple("white", "50", "nepal"));
        lstApple.add(new Apple("grey", "152", "burma"));
        lstApple.add(new Apple("red", "10", "srilanka"));
        return lstApple;
    }
}
