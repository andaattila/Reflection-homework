package occupations;

public class Chef extends Person {
    public Chef() {
    }

    public Chef(String name, int age, Gender gender) {

    }

    public static void introduce() {
        System.out.println("Hi, my name is " + getName() + ". I am " + getAge() + ". I am a " + getGender() + " and a chef.");
    }

    public static String cook(String food) {
        return getName() + " has cooked some " + food;
    }
}
