package baitap.StaticVariable;

class Counter {
    static int count = 10; // Biến tĩnh, được chia sẻ giữa tất cả các đối tượng

    Counter() {
        count++; // Tăng giá trị biến tĩnh mỗi khi tạo đối tượng
    }

    static void displayCount() {
        System.out.println("Số đối tượng đã được tạo: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        Counter.displayCount(); // Kết quả: Số đối tượng đã được tạo: 3
    }
}
