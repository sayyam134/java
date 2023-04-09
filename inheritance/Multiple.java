interface Animal{
    void run();
}
interface Mammal{
    void giveBirth();
}

class Dog implements Animal, Mammal{
    @Override
    public void run(){
        System.out.println("Dog is running..!");
    }

    @Override
    public void giveBirth(){
        System.out.println("Dog is giving birth..!");
    }

    void sound(){
        System.out.println("Bhaw Bhaw..!");
    }
}
public class Multiple{
    public static void main(String[] args){
        Dog tommy = new Dog();
        tommy.run();
        tommy.giveBirth();
        tommy.sound();
    }
}