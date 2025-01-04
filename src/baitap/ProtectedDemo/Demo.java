package baitap.ProtectedDemo;

public class Demo {
    protected int tuoi = 9; // protected access
    protected int diem;

    public Demo() {
    }
    //2 thread cùng access vào Demo ,
    //thread 1 check nếu diem < 10 ,thì diem++ 8-> 9
    //thread 2 : check  nếu điểm > 10, thi diem-- 9->8
}
