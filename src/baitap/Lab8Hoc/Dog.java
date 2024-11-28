package baitap.Lab8Hoc;

import baitap.Lab8Hoc.IAnimal;

public class Dog implements IAnimal {

    @Override
    public void animalSound() {
        System.out.println("Gâu Gâu");
    }

    @Override
    public void run() {
        System.out.println("Bơi");

    }
}
