import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> integerSupplier = () -> 5;
        Supplier<String> stringSupplier = () -> "hello world";
        Supplier<String> nameSupplier = () -> "Attila";
        Supplier<Person> personSupplier = () -> new Person();

        Consumer<Animal> animalConsumer = (a) -> System.out.println(a);
        Consumer<Boolean> trueConsumer = b -> System.out.println(b);
        Consumer<Double> doubleConsumer = doublenumber -> System.out.println(doublenumber);
        Consumer<String> stringConsumer = string -> System.out.println(string);

        Predicate<Integer> integerPredicate = number -> number % 20 == 0;
        Predicate<Integer> integerPredicate1 = number -> number > 1 && Math.sqrt(number) % 1 == 0;
//        Predicate<Integer> integerPredicate2 = number -> isPrime(number);
        Predicate<Person> personPredicate = person1 -> person1.getAge() >= 50 && person1.getName().equals("Andrea");
        Predicate<String> stringPredicate = testText -> testText.length() >= 5 && testText.length() <= 20;

        Function<Animal, Integer> animalFunction = a -> a.getNumberOfLegs();
        Function<Animal, Integer> animalAgeFunction = a -> a.getAge() * 2;
        Function<Animal, String> animalStringFunction = a -> a.toString();
        Function<TemperatureSensor, Double> lastReadDataFunction = a -> a.getLastReadData();

        UnaryOperator<Integer> integerUnaryOperator = number -> number * 3;
        UnaryOperator<Integer> integerUnaryOperator1 = number -> number * number;
        UnaryOperator<String> stringUnaryOperator = text ->new StringBuilder().append(text).append(text).toString();
        UnaryOperator<Animal> animalUnaryOperator = a -> new Animal(a.getAge()+25,a.getType());
    }
}
