package baitap.Lab9Hoc;

import java.util.Scanner;


// Exception là các lỗi xảy ra sau khi " chạy chương trình và khiến chương trình dừng lại


// Checked Exception
//Checked Exception: Là ngoại lệ thường xảy ra do người dùng mà không thể lường trước được bởi lập trình viên.
// Ví dụ, một file được mở, nhưng file đó không thể tìm thấy và ngoại lệ xảy ra.
// Những ngoại lệ này không thể được bỏ qua trong quá trình biên dịch.
// Checked Exception là các lớp mà kế thừa lớp Throwable ngoại trừ RuntimeException và Error.

//Unchecked Exception
//Exception này khá nguy hiểm, khi mà trình biên dịch không thể nào kiểm tra giúp bạn sự lai lệch luồng có thể xảy đến như trên kia.
// Và ứng dụng của bạn khi đến tay người dùng, khi người dùng đang thao tác thì… bùm! Ứng dụng “đột tử”.

//Error ở đây cũng là Exception nhưng hơi khác với Exception một chút.
// Với hai loại Exception mà mình nói đến trên đây thực ra chưa phải là lỗi, bởi vì bạn không nên né tránh nó mà nên đối mặt
// và “bẻ” luồng ứng dụng sao cho khi gặp Exception này ứng dụng sẽ biết cách phản hồi đúng đắn.

//Có 5 từ khóa được sử dụng để Xử lý ngoại lệ trong Java, đó là:
//
//try.
//catch.
//finally.
//throw.
//throws.


public class Bai1TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhập x = ");

            try{
                int x = sc.nextInt();
                try {
                    System.out.println(" kết quả 10/x = " + 10 / x);
                    break;
                }   catch (Exception e) {
                    System.out.println(" run error");
                    throw new Exception(" chia cho khong");
                    //  TODO: handle exception
                }
//                break;
            } catch (Exception e) {
                sc.next();
                continue;
            } finally {
                System.out.println("Đây là finally");
            }
        }

    }
}
