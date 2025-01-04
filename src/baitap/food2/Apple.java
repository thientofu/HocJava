package baitap.food2;

import baitap.food.Fruit;

public class Apple extends Fruit {
    private static String name;

    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple.name = "Táo";
        System.out.println("Apple name: " + apple.name);
    }
}
