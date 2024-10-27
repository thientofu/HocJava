package baitap.BaiTap;

import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Nhập dữ liệu
        System.out.println("Nhập số nguyên: ");
        int value = scanner.nextInt();
        //số nguyên tố chỉ chia hết cho 1 và chính nó 1<count<value
        int count = 0;
        for (int i = 2; i < value - 1; i++) {
            if (value % i == 0) {
                System.out.println("Ước bội số khác: " + i);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Đây là số nguyên tố.");
        }else {
            System.out.println("Đây không phải là số nguyên tố.");
        }
        scanner.close();
    }
}
