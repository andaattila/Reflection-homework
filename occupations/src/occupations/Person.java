package occupations;

public class Person {
    static int age;
    static String name;
    static Gender gender;

    public Person() {
        this.age = 0;
        this.name = "unknown";
        this.gender = Gender.UNDEFINED;
    }

    public Person(int age, String name, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }


    public static Gender getGender() {
        return gender;
    }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    public static void introduce(String name, int age, Gender gender) {
        System.out.println("Hi, my name is " + name + " I am " + age + ". I am a " + gender);
    }

    public static void introduce() {
        System.out.println("Hi, my name is " + name + " I am " + age + ". I am a " + gender);
    }

    public static void printGoal() {
        System.out.println("My goal is to be happy in the future");
    }

    @Override
    public String toString() {
        return "My age is " + age + " my name is " + name + " and I am a " + gender;
    }
}
