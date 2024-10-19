package baitap.BaiTap;

import java.util.Scanner;

public class homework1 {


public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Nhập dữ liệu
        
        System.out.println("Số phân tử của mảng :");//Xuất ra "Số phân tử của mảng"
        int n = scanner.nextInt();//Nhập vào số phân tử của mảng
        
        int[] numbers = new int[n];//Khởi tạo mảng với số phân tử n
        
        System.out.println("Nhập các phần tử của mảng: ");//Xuất ra "Nhập các phần tử của mảng"
        
        //Khởi động for để gán giá trị cho mảng(n phần tử) i bắt đầu từ 0, bé hơn n(số phần tử của mảng), i tăng thêm 1 giá trị
        for(int i = 0; i < n; i++) {
        	System.out.println("Phần tử thứ " + (i + 1) + ":");
        	numbers[i] = scanner.nextInt();
        }
        //Tính tổng phần tử trong mảng
        int sum = 0;
        for (int i = 0; i < n; i++) {
        	sum = sum + numbers[i];
        }
        //In ra tổng của các phân tử trong mảng
        System.out.println("Tổng của các phân tử trong mảng là: " + sum);
        
        scanner.close();

	}

}
