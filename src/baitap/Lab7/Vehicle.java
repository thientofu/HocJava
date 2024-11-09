package baitap.Lab7;

//SupperClass cha mẹ, sẽ cho đi "tài sản" để class khác kế thừa lại.
//

public class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}
