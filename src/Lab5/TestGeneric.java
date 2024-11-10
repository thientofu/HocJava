package Lab5;

import java.util.ArrayList;

public class TestGeneric {
    public static void main(String[] args) {

        //Generic là truyền 1 biến Object vào ArrayList
        //Generic giúp "báo lỗi" khi "dịch code " (code gồm 2 giai đoạn: compile then run)
        //Generic giúp tái sử dụng code (ví dụ như viết các hàm, class tổng quát)


        ArrayList<String> cars2 = new ArrayList<String>();// cú pháp Generic<String>
        //ArrayList<String> cars2 = new ArrayList<>();// cú pháp Diamond v7-9

        cars2.add("BMW");
        cars2.add("Audi");
        cars2.add("Volvo");
        cars2.add("Honda");
        cars2.add("Ford");
    }
}
