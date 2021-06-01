package CHPT_7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEX {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[] {
                "Apple", "Orange", null, "Mango", null});
        Set<String> set = new HashSet<>(list);

        for (String str: set)
            System.out.print(str + "\t");
        System.out.println();

        set.add("Strawberry");
        for (String str: set)
            System.out.print(str + "\t");
        System.out.println();

        set.add(null);
        for (String str: set)
            System.out.print(str + "\t");
    }
}
