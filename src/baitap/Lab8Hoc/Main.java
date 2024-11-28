package baitap.Lab8Hoc;

class Main {
    public static void main(String[] args) {
        IAnimal myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.run();
        IAnimal myDog = new Dog();
        myDog.animalSound();
        myDog.run();

    }
}