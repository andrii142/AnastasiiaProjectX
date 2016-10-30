package datastructures;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();


        Map<Integer, String> map1 = new TreeMap<>();
        map1.put(1, "test");
        map1.put(2, "kiev");

        List<MapWrapper> list = new ArrayList<>();

        //entry
        Set<Map.Entry<Integer, String>> set = map1.entrySet();
        for(Map.Entry entry : set) {
            System.out.println(entry);
        }
    }

}
