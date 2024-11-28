package baitap.Lab8Hoc;

import baitap.Lab8Hoc.IAnimal;

public class Pig implements IAnimal {
    public void animalSound( ) {
// The body of animalSound( ) is provided here
        System.out.println("The pig says: wee wee");
    }

    @Override
    public void run() {

    }

    public void sleep( ) {
// The body of sleep( ) is provided here
        System.out.println("Zzz");
    }
}
