package baitap.Lab7;

public class scoreSinhVien {
    public static void main(String[] args) {
        SinhVien it1 = new SinhVienIT(10,8);
        System.out.println("Diem Sinh Vien IT = " + it1.getScore());
        SinhVien cokhi1 = new SinhVienCoKhi(7,10);
        System.out.println("Diem Sinh Vien Cokhi = " + cokhi1.getScore());
    }
}
