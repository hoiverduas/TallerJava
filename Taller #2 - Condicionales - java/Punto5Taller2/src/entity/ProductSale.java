package entity;

import java.util.List;

public class ProductSale {

    private List<Products>productss;
    private int totalPrice;

    public ProductSale(List<Products> productss, int totalPrice) {
        this.productss = productss;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "ProductSale{" +
                "productss=" + productss +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
