package baitap.BaiTap;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện: ");
        int sodien = scanner.nextInt();
        if(sodien <=100){
            int sotiendien = sodien * 1000;
            System.out.println("Số tiền điện: " + sotiendien);
        }else {
            int sotiendien = 100 * 1000 + (sodien -100) * 1500;
            System.out.println("Số tiền điện: " + sotiendien);
        }
        scanner.close();
    }
}
