package baitap.BaiTap;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>Lựa chọn tính năng<<");
        System.out.println("++------------------++");
        System.out.println("|1.Giải phương trình bậc nhất:|");
        System.out.println("|2.Giải phương trình bậc hai:|");
        System.out.println("|3.Tính số tiền điện:|");
        System.out.println("|4.Kết thúc|");
        System.out.println("|++-----------|");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                bai1();
                break;
            case 2:
                bai2();
                break;
            case 3:
                bai3();
                break;
            default:
                System.out.println("Bạn đã thoát chương trình");
                System.exit(0);
        }
    }

    public static void bai1() {
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
    }
    public static void bai2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        if(a==0 && b==0){
            System.out.println("Phương trình có vô số nghiệm. ");
        }else if(a==0 && b!=0) {
            System.out.println("Phương trình vô nghiệm. ");
        }else{
            int delta = b * b - 4 * a * c;
            if(delta<0){
                System.out.println("Phương trình vô nghiệm.");
            }else if(delta==0){
                float x = (float) -b / (2*a);
                System.out.println("Phương trình có nghiệm kép: " + x);
            }else if(delta>0){
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiêm riêng biệt: x1 = " + x1 + " x2 = " + x2 );
            }
        }
    }
    public static void bai3() {
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
