package lab4;

public class Product {
    private String productName;
    private double productPrice;
    private double productTax;

    public Product() {

    }

    public Product(String productName, double productPrice, double productTax) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productTax = productTax;
    }

    public double getProductTax() {
        return productTax;
    }

    public void setProductTax(double productTax) {
        this.productTax = productTax;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product nhapThongTin(String productName, double productPrice, double productTax) {
        Product pr = new Product(productName, productPrice, productTax);
        return pr;
    }

    public void xuatThongTin(Product pr) {
        System.out.println("Tên sản phẩm: " + pr.getProductName() + " Giá sản phẩm: " + pr.getProductPrice() + " Thuế sản phẩm: " + pr.getProductTax());
    }

    public double getTaxPrice(double tax, double price) {
        return price * tax;
    }
}
