package occupations;

public class Chef extends Person {
    public Chef() {
    }

    public Chef(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + getName() + ". I am " + getAge() + ". I am a " + getGender() + " and a chef.");
    }

    public String cook(String food) {
        return getName() + " has cooked some " + food;
    }
}
