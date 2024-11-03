package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arrayNumber = new ArrayList<>();

        while(true){
            System.out.println("Nhập vào 1 số thực bất kỳ: ");
            double input = sc.nextDouble();
            arrayNumber.add(input);

            System.out.println("Tiếp tục hay không? Y hoặc N ?");
            String answer = sc.next();
            if(answer.equals("N") || answer.equals("n")){
                break;
            }
        }

        System.out.println(" Kiểm tra array: " + arrayNumber);
        double sum = 0;
        for (int i = 0; i < arrayNumber.size(); i++) {
            sum += arrayNumber.get(i);
        }

        System.out.println(" Tổng array: " + sum);
    }
}
