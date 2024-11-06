package Lab5;

import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Honda");
        cars.add("Ford");
        cars.add(0, "Mazda");// tên mảng.add(số thứ từ trong list, element);
        System.out.println(cars);// gọi phân tử trong mảng: tên mảng.get(index), Xóa phân tử trong mảng: tên mảng.remove(index), Xóa hết phân tử trong mảng: car.clear(), hiện số phân tử : car.size(),
    }
}
