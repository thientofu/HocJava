package baitap.BaiTap;

import java.util.Scanner;
import java.util.Arrays;


public class Lab3Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Nhập dữ liệu
        System.out.print("Nhập số lượng phân tử của array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.println("Nhập phân tử của array: ");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Array ban đầu: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Array sắp xếp: " + Arrays.toString(a));

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        scanner.close();


    }
}
