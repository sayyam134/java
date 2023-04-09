class Animal{
    void run(){
        System.out.println("Animal is running..!");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Bhaw Bhaw..!");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow Meow..!");
    }
}

public class Hierarchical{
    public static void main(String[] args){
        Dog tommy= new Dog();
        Cat rani = new Cat();
        tommy.run();
        tommy.sound();

        rani.run();
        rani.sound();
        
    }
}