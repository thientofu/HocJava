package baitap.BaiTap;

import java.util.Scanner;

public class Lab2Bai2 {
    public static void main(String[] args) {
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
        scanner.close();
    }
}
