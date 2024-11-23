package baitap.Lab9BaiTap;

import java.util.Scanner;

public class MainSinhVien {
    public static int nhapMasv(){

        int result;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhập mã sinh viên: ");
            try{
                result = sc.nextInt();
                break;
            } catch(Exception e){

                System.out.println("Mã số nhân viên không hợp lệ");
                sc.nextLine();
            }
        }
    }

    public static double nhapDiemsc(){
        double result;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhập số điểm ");
            try {
                result = sc.nextDouble();
                if(result >= 0 && result <= 10){
                    System.out.println("Điểm hợp lệ");
                }else {
                    System.out.println("Điểm là từ 0-10");
                }
            } catch(Exception e){
                System.out.println("Vui lòng nhập lại số thực");
                sc.nextLine();

            }
        }

    }
public static int nhapDoTuoi(){

    int result;
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("Nhập độ tuổi sinh viên: ");
        try{
            result = sc.nextInt();
            if(result >= 18 && result <= 100){
                System.out.println("Độ tuổi hợp lệ");
            } else{
                System.out.println("Độ tuổi là từ 18-100 tuổi");
            }
        } catch(Exception e){

            System.out.println("Độ tuổi là số nguyên");
            sc.nextLine();
        }
        sc.close();
        return result;
    }
}
    public static void main(String[] args) {

        System.out.println("chạy");

        try(Scanner sc = new Scanner(System.in)){
           int masv = nhapMasv();
           double diemsc = nhapDiemsc();
            int age = nhapDoTuoi();
           SinhVien sv = new SinhVien(123, 20, 10, "Phan Thanh Thiện");
            System.out.println("info sv " + sv);
        }
    }
}
