package baitap.BaiTap;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Nhập dữ liệu
        System.out.println("Nhập cạnh 1: ");
        int canh1 = scanner.nextInt();
        System.out.println("Nhập cạnh 2: ");
        int canh2 = scanner.nextInt();
        int chuvi = (canh1 + canh2) * 2;
        int dientich = canh1 * canh2;
        int canhnhonhat = Math.min(canh1, canh2);
        System.out.println("Chu vi của hình chữ nhật: " + chuvi + " Diện tích hình chữ nhật " + dientich + " Cạnh nhỏ nhất của hình chữ nhật: " + canhnhonhat);
        scanner.close();
    }
}
