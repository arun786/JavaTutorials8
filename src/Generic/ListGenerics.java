package Generic;

import java.util.ArrayList;
import java.util.List;

public class ListGenerics {
    public static void main(String[] args) {
        List<Integer> lstOfInteger = new ArrayList<>();
        lstOfInteger.add(1);
        lstOfInteger.add(2);
        lstOfInteger.add(3);
        lstOfInteger.add(4);
        boolean add = lstOfInteger.add(5);

        printDoubledValue(lstOfInteger);
    }

    private static void printDoubledValue(List<Integer> lsts) {
        for (Integer lst : lsts) {
            System.out.println(lst * 2);
        }
    }
}
