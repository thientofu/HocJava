package baitap.lab4;

public class mainProduct {
    public static void main(String[] args) {
        Product product_1 = new Product("computer", 200, 0.1);
        System.out.println("Tax = " + product_1.getTaxPrice());
        long protect_val = product_1.value_protect;
        DemoEncapsulation demo = new DemoEncapsulation(10,"khoand");
        demo.setSalary(1000);
        //truy xuất vào biến ID và FUll_NAME
        long idDemo = demo.id;
        String full_name = demo.getFull_name();
        System.out.println("Full_NAME :"+ full_name);
        System.out.println("salary :"+ demo.getSalary());

    }
}
