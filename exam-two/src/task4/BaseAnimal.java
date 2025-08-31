package task4;

public abstract class BaseAnimal implements Animal {
    String name;
    int age;


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public BaseAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
