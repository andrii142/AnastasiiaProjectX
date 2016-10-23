package lesson4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("test");
        set.add("test1");
        set.add("test1");

        System.out.println(set);

        Set<User> userSet = new HashSet<>();
        userSet.add(new User("Denis", 20));
        userSet.add(new User("Taras", 50));
        userSet.add(new User("Taras", 50));

        System.out.println(new User("Taras", 50).equals(new User("Taras", 50)));


        System.out.println(userSet);


        Set<String> treeSet = new TreeSet<>();
        treeSet.add("test");
        treeSet.add("test1");
        treeSet.add("test1");
        treeSet.add("aaa");


        Set<User> usersTreeSet = new TreeSet<>();
        usersTreeSet.add(new User("Denis", 20));
        usersTreeSet.add(new User("Taras", 50));
        usersTreeSet.add(new User("Taras", 50));
        usersTreeSet.add(new User("Olga", 10));

        System.out.println(usersTreeSet);

    }
}
