package datastructures;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("test");
        list.add("test");
        list.add(0, "test5");

        list.set(0, "testn");

        list.add("5");

        //list.add("");

        list.get(2);

        System.out.println(list);

        System.out.println(list.get(2));

        /*list.remove("test");

        list.remove(1);*/

        List<String> list1 = new ArrayList<>();
        list1.add("test");
        //list1.add("ppp");

        /*list.removeAll(list1);

        System.out.println(list);*/

        UnaryOperator<String> operator = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if (s.equals("test"))
                    return "not";
                return s;
            }
        };

        int index = 0;
        for (String item : list) {
            index++;
            if (item.equals("test")) {
                int indexNew = list.indexOf(item);
                item = "not";
                list.set(indexNew, item);
            }
        }

        list.replaceAll(operator);

        System.out.println(list);

        list = list.stream()
                .map(operator)
                .collect(Collectors.toList());

        System.out.println(list);


        /*Set<String> set= new HashSet<>(list);

        System.out.println(set);*/


        List<String> linkedList = new LinkedList<>();

        Iterator iterator = list.iterator();


    }
}
