interface Animal {
    void makeSound();
}

interface Mammal {
    void giveBirth();
}

class Dog implements Animal, Mammal {
    @Override
    public void makeSound() {
        System.out.println("Dog makes sound.");
    }

    @Override
    public void giveBirth() {
        System.out.println("Dog gives birth.");
    }

    void bark() {
        System.out.println("Dog barks.");
    }
}

class Pug extends Dog{
    void breed(){
        System.out.println("I am a Dog of Breed Pug..!");
    }
}

public class Hybrid{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); 
        dog.giveBirth(); 
        dog.bark(); 

        Pug tommy= new Pug();
        tommy.makeSound();
        tommy.giveBirth();
        tommy.bark();
        tommy.breed();
    }
}
