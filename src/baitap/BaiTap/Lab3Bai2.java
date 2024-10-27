package baitap.BaiTap;

import java.util.Scanner;

public class Lab3Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Nhập dữ liệu
        System.out.println("Nhập số nguyên: ");
        int x = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf(" %d x %d = %d ", x, i, x * i);

            System.out.printf("\n");
        }
        scanner.close();
    }
}
