package occupations;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(25, "Feri", Gender.MAN);
        Person person2 = new Person(76, "Emilia", Gender.WOMAN);
        Person person3 = new Person(18, "Samanta", Gender.WOMAN);
        Person person4 = new Person(39, "Alexander", Gender.MAN);
        Person person5 = new Person(54, "Beth", Gender.WOMAN);
        Person person6 = new Person();
        person6.age = 35;
        person6.name = "Bandi";
        Person person7 = new Person();
        person7.age = 0;
        person7.gender = Gender.UNDEFINED;
        Person person8 = new Person();
        person8.age = 98;
        person8.name = "Bucky";
        person8.gender = Gender.MAN;
        Person person9 = new Person();
        person9.age = 10;
        Person person10 = new Person();
        person10.gender = Gender.MAN;
        Chef chef1 = new Chef();
        chef1.age = 20;
        Chef chef2 = new Chef();
        chef2.gender = Gender.WOMAN;
        Chef chef3 = new Chef();
        chef3.age = 34;
        Chef chef4 = new Chef();
        chef4.age = 21;
        Chef chef5 = new Chef();
        chef5.gender = Gender.MAN;
        chef5.name = "Ennio";
        Chef chef6 = new Chef("Jim", 41, Gender.MAN);
        Chef chef7 = new Chef("Jack", 27, Gender.MAN);
        Chef chef8 = new Chef("Jill", 43, Gender.WOMAN);
        Chef chef9 = new Chef("Johanna", 8, Gender.WOMAN);
        Chef chef10 = new Chef("Julia", 4, Gender.WOMAN);

        person3.introduce();
        Person.printGoal();
        chef4.introduce();
    }
}
