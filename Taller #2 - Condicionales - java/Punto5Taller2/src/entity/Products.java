package entity;

import java.util.List;

public class Products {


    private  String refID;
    private String producto;

    private Integer price;

    private Integer stock;

    public Products(String refID, String producto, Integer price, Integer stock) {
        this.refID = refID;
        this.producto = producto;
        this.price = price;
        this.stock = stock;
    }




    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "refID='" + refID + '\'' +
                ", producto='" + producto + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
