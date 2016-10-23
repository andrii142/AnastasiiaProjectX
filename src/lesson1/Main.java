package lesson1;

/**
 * Created by Andrey on 9/1/16.
 */
public class Main {
    public static void main(String[] args) {
        ClassA object1 = new ClassA();
        ClassA object2 = new ClassB();

        //object1.test();
        //object2.test();

        test(object1);
        test(object2);
    }

    static void test(ClassA classA) {
        classA.test();
    }
}
