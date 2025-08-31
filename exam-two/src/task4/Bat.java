package task4;

public non-sealed class Bat extends Mammal{
    public Bat(String name, int age) {
        super(name, age);
    }

    @Override
    public DietType getDietType() {
        return null;
    }
}
