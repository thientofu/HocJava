package baitap.Lab7;

//Polymorphism là thể hiện thằng cha bằng bất cứ đứa con nào


class Animal{
    void eat(){System.out.println("eating");}
}
class Dog extends Animal{
    void eat(){System.out.println("eating fruits");}
}
class BabyDog extends Dog{
    int age;
    int weitght;
    void eat(){System.out.println("drinking milk");}
    public static void main(String args[]){
        Animal a1,a2;
        a1 = new BabyDog();
        a2 = new BabyDog();


        a1.eat();
    }
}
