package lab4;

public class mainProduct {
    public static void main(String[] args) {
        Product test = new Product();
        Product pr1 = test.nhapThongTin("computer", 200, 0.1);
        test.xuatThongTin(pr1);
        System.out.println("Tax = " + test.getTaxPrice(pr1.getProductTax(), pr1.getProductPrice()));

        DemoEncapsulation demo = new DemoEncapsulation(10,"khoand");
        demo.setSalary(1000);
        //truy xuất vào biến ID và FUll_NAME
        long idDemo = demo.id;
        String full_name = demo.getFull_name();
        System.out.println("Full_NAME :"+ full_name);
        System.out.println("salary :"+ demo.getSalary());

    }
}
