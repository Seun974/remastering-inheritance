package se.lexicon.samuel;

public class Dog extends Animal {
    //the fields or characteristics below will be specific to this Dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //since body and brains are applicable to dogs, the field can be replaced with 1 then the new fields can be added &
    // initialized in the constructor

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //this will be a method unique to the dog
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    //this now becomes particular to this class dog and makes it possible to still take an implementation from the parent class
    //so override makes you sort of borrow that method and you can still add a new feature to the it like the chew();
    //the super still makes it possible to point to the main object class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    //at this point, java looks into the main class to execute this method it is pointed at
    public void walk() {
        System.out.println("dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("dog.run() called");
        move(10);
    }
    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    //this method is executed first if there is no other move method in this class
    //so the code looks for another one with the super keyword and goes to the parent class to also execute it
    //with super you can still pick a method from a parent class and with the override function still working in the child class
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}