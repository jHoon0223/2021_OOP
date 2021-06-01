package CHPT_7;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Arrays;

public class ListIteratorEX {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Orange", "Mango", "Strawberry");
        list = new ArrayList<>(list);

        ListIterator<String> litr = list.listIterator();

        while(litr.hasNext()) {
            String str = litr.next();
            System.out.print(str + "\t");

            if (str.equals("Orange"))
                litr.add("After_Orange");
        }
        System.out.println();

        while(litr.hasPrevious()) {
            String str = litr.previous();
            System.out.print(str + "\t");

            if (str.equals("Mango"))
                litr.add("Before_Mango");
        }
        System.out.println();

        for (String str: list)
            System.out.print(str + "\t");
        System.out.println();
    }
}
