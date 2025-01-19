package baitap.PrivateAccessDemo;

public class NhanVien {
    private String name;

    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.name = "Thiện";

        System.out.println(nv.name);
    }
}
