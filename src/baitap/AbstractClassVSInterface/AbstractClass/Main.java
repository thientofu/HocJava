package baitap.AbstractClassVSInterface.AbstractClass;

interface DongVatCaSi{
    void hat();//Phương thức trong interface chỉ có trừu tượng
}

interface DongVatBietBay{
    void bay();
}

abstract class DongVat {

    public abstract void noi();//Đây là phương thức trừu tượng
    public void ngu(){ //Đây là phương thức cụ thể
        System.out.println("Động vật đang ngủ");
    }
}

class HoaMi extends DongVat implements DongVatCaSi, DongVatBietBay{
    @Override
    public void hat() {
        System.out.println("Hót líu lo");
    }

    @Override
    public void noi() {
        System.out.println("Líu lo");
    }

    @Override
    public void bay() {
        System.out.println("Bạch Bạch");
    }
}
class Meo extends DongVat{
    @Override
    public void noi() {
        System.out.println("Meo Meo");
    }
}

class Cho extends DongVat{
    @Override
    public void noi() {
        System.out.println("Gau Gau");
    }
}

public class Main {
    public static void main(String[] args) {
        Meo Meo = new Meo();
        Meo.ngu();
        Meo.noi();
//Chung phương thức là ngủ, nhưng phương thức trừu tượng noi thì phải tự triển khai riêng
        Cho Cho = new Cho();
        Cho.ngu();
        Cho.noi();

        HoaMi HoaMi = new HoaMi();
        HoaMi.ngu();
        HoaMi.hat();
        HoaMi.ngu();
        HoaMi.bay();

    }
}
