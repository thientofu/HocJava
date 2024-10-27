package baitap.demo_protect;

import lab4.Product;

public class ProductExt extends Product {
    public ProductExt(String productName, double productPrice, double productTax) {
        super(productName, productPrice, productTax);
    }

    public ProductExt(String productName, double productPrice) {
        super(productName, productPrice);
    }

    protected long getValProtected() {
        return  this.value_protect;
    }

}
