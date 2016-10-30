package datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kiev");
        map.put(2, "Krakow");


        List<MapWrapper> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            MapWrapper<Integer, String> mapWrapper = new MapWrapper<>(key, map.get(key));
            list.add(mapWrapper);
        }

        System.out.println(list);
    }


    private static <T> int testGeneric(T t) {
        if (t instanceof String) return ((String) t).length();
        return 0;
    }
}
