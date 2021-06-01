package CHPT_7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEX {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[] {
                "Apple", "Orange", null, "Mango", null});

        for (String str: list)
            System.out.print(str + "\t");
        System.out.println();

        Set<String> set = new HashSet<>(list);
        set.add("Strawberry");
        set.add(null);

        for (String str: set)
            System.out.print(str + "\t");
    }
}