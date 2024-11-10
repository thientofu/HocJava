package baitap.Lab7;

//SupperClass cha mẹ, sẽ cho đi "tài sản" để class khác kế thừa lại.
//chỉ kế thừa protected và public không kế thừa private

public class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}
