package CHPT_7;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx {
    static void printList(LinkedList<String> I) {
        Iterator<String> iterator = I.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            String separator;
            if (iterator.hasNext())
                separator = "->";
            else
                separator = "\n";
            System.out.print(e + separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Transformer");
        myList.add("Star Wars");
        myList.add("Matrix");
        myList.add(0, "Terminator");
        myList.add(2, "Avatar");

        int index = Collections.binarySearch(myList, "Terminator");
        System.out.println("Terminator's index number is " + index);

        printList(myList);

        Collections.sort(myList);
        printList(myList);

        Collections.reverse(myList);
        printList(myList);


    }
}
