package baitap.BaiTap;

import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        if(a==0 && b==0){
            System.out.println("Phương trình có vô số nghiệm. ");
        }else if(a==0 && b!=0) {
            System.out.println("Phương trình vô nghiệm. ");
        }else{
            int x = -b/a;
            System.out.println("Phương trình có nghiệm x: " + x);
        }
        scanner.close();
    }
}
