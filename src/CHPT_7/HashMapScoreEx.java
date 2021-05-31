package CHPT_7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();

        h.put("김성동", 97);
        h.put("황기태", 88);
        h.put("김남윤", 98);
        h.put("이재훈", 100);
        h.put("한원선", 99);

        System.out.println("HashMap의 요소 개수 : " + h.size());

        Set<String> s = h.keySet();
        Iterator<String> i = s.iterator();

        while(i.hasNext()) {
            String name = i.next();
            int score = h.get(name);
            System.out.println(name + " : " + score);
        }
    }
}
