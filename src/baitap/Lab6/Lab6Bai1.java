package baitap.Lab6;

import java.util.Scanner;

public class Lab6Bai1 {
    public static void main(String[] args) {

        //Method thuường dùng cho String:Equal dùng để so sánh trả về giá trị true hoặc false
        //Length() trả về độ dài của chuỗi
        //trim() xóa đi space đầu/cuối của chuỗi
        //toLowerCase() viết thuường tất cả ký tự
        //toUpperCase() viết hoa tất cả ký tự
        //substring() cắt chuỗi thành chuỗi con


        System.out.println("Nhập username: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println("Nhập password: ");
        String password = sc.nextLine();
        System.out.println("username: " + username + " password: " + password);


        if(username.equals("thientofu") && password.length() > 6) {
            System.out.println("Hợp Lệ");
        }
    }
}
