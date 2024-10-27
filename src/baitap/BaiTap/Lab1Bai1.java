package baitap.BaiTap;

import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Nhập dữ liệu
        System.out.println("Tên sinh viên:");
        String name = scanner.nextLine();
        System.out.println("Điểm:");
        int score = scanner.nextInt();
        System.out.println("Tên sinh viên: " + name + " Điểm: " + score);
        scanner.close();
    }
}
