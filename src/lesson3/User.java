package lesson3;

public final class User {
    private String name;
    private int age;

    static String companyName;
    static String description = "Some text";

    static {
        System.out.println("test");
    }

    static String editCompany() {
        return "User's company is : IBM"; // + companyName;
    }


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    final void change() {
        age = 20;
        //companyName = "Toyota";
    }
}
