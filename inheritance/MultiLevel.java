class Animal{
    void run(){
        System.out.println("Animal is running..!");
    }
}

class Mammal extends Animal{
    void giveBirth(){
        System.out.println("I give birth directly");
    }
}

class Dog extends Mammal{
    void sound(){
        System.out.println("Bhaw Bhaw..!");
    }
}

public class MultiLevel{
    public static void main(String[] args){
        Dog tommy = new Dog();
        tommy.run();
        tommy.giveBirth();
        tommy.sound();
    }
}