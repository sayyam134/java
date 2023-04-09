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

public class Single{
    public static void main(String[] args){
        Animal cat = new Animal();
        cat.run();

        Dog tommy= new Dog();
        tommy.sound();
        tommy.run();
        
    }
}