package task4;

sealed public abstract class Mammal extends BaseAnimal permits Bat, Lion {
    public Mammal(String name, int age) {
        super(name, age);
    }
}
