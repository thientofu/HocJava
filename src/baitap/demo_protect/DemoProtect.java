package baitap.demo_protect;

public class DemoProtect {
    public static void main(String[] args) {
        ProductExt product_1 = new ProductExt("computer", 200, 0.1);
        long valProtected =  product_1.getValProtected() ;
    }
}
