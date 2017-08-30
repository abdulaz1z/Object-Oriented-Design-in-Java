package domain;

public class Employee {
    private int id;
    private String name;
    private int age;
    private boolean isWorking = false;

    private static int counter;

    public Employee(String name, int age, boolean isWorking) {
        this.name = name;
        this.age = age;
        this.isWorking = isWorking;
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isWorking=" + isWorking +
                '}';
    }


}
