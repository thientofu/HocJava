package baitap.BaiTap;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("Nhập phần tử: ");
        // For reading the element
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
//        System.out.println("Array ban đầu: " + Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array sắp xếp: " + Arrays.toString(a));
//		System.out.println(" max = " + a[a.length - 1]);
//		System.out.println(" min = " + a[0]);

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println(" max = " + max);
        System.out.println(" min = " + min);
    }


}
