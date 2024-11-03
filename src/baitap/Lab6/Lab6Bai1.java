package baitap.Lab6;

import java.util.Scanner;

public class Lab6Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhập username: ");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println("Nhập password: ");
        String password = sc.nextLine();
        System.out.println("username: " + username + " password: " + password);


        if(username.equals("thientofu") || password.length() > 6) {
            System.out.println("Hợp Lệ");
        }
    }
}
