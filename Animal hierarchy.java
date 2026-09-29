class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks: Woof Woof!");
    }
}

class Fox extends Animal {
    Fox(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " yips: Ring-ding-ding!");
    }
}

class Rabbit extends Animal {
    Rabbit(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " thumps silently.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal fox = new Fox("Finnegan");
        Animal rabbit = new Rabbit("Thumper");

        dog.makeSound();
        dog.eat();

        fox.makeSound();
        fox.eat();

        rabbit.makeSound();
        rabbit.eat();
    }
}
