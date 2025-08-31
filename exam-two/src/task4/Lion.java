package task4;

public non-sealed class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public DietType getDietType() {
        return null;
    }

    @Override
    public boolean isEndangered() {
        return super.isEndangered();
    }
}
