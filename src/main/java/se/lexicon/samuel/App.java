package se.lexicon.samuel;


public class App 
{
    public static void main( String[] args ) {
        Animal animal = new Animal("Animal", 1,1,5,5);
        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"Long silky");

        //dog.eat();
        //dog.walk();
        //dog.run();
        Fish fish = new Fish("tilapia", 2,10,4,2,3);
        fish.move(10);


    }
}
