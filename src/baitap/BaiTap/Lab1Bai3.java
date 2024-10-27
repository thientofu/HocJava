package baitap.BaiTap;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Nhập dữ liệu
        System.out.println("Nhập độ dài của khối lập phương: ");
        int dodai = scanner.nextInt();
        double thetich = Math.pow(dodai, 3);
        System.out.println("Thể tích của khối lập phương: " + thetich);
        scanner.close();
    }
}
