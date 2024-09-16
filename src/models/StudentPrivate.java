package models;

public class StudentPrivate {
    private String name;
    private int age;

    public StudentPrivate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
