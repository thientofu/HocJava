package baitap.Lab7;

//SubClass là đứa con, sẽ kế thừa thuộc tính(inherit) và phương thức(attribute&method) từ Supperclass
//Để kế thừa dùng keyword extends
//Keyword "super" là để truy cập tới thuộc tính và method của cha
//Keyword "overridding" là ghi đè lại
//Keyword "overloading" là định nghĩa nhiều method có tên giống nhau nhưng tham số đầu vào khác nhau

public class Car extends Vehicle {
    private String modelName = "Mustang"; // Car attribute

    public static void main(String[] args) {
// tạo Object mới myCar
        Car myCar = new Car();
// gọi method honk() (từ Vehicle class) vào myCar object
        myCar.honk();
// Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
