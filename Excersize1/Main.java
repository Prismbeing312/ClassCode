package Excersize1;

public class Main {
    public static void main(String[] args) {
       Dog dog = new Dog("Charlie");
       Cat cat = new Cat("kingly");
       Horse horse = new Horse("Tyrone");
        System.out.println(dog.getName());
        System.out.println(cat.getName());
        System.out.println(horse.getName());
        Animal[] animals = {dog, cat, horse};
        for (Animal zoo: animals ) {
            System.out.println(zoo.getName());
            System.out.println(zoo.legsAmount());
            System.out.println(zoo.isBreatheFire());
            System.out.println(zoo.healingTime + " Minutes");
        }
    }
}
