package entity;

public class Cake {

    private  String refID;
    private String cakeDescription;
    private Integer price;

    private Integer portions;


    public Cake() {
    }

    public Cake(String refID, String cakeDescription, Integer price, Integer portions) {
        this.refID = refID;
        this.cakeDescription = cakeDescription;
        this.price = price;
        this.portions = portions;
    }

    public Integer getPrice() {
        return price;
    }

    public String getRefID() {
        return refID;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "refID = '" + refID + '\'' +
                ", cakeDescription ='" + cakeDescription + '\'' +
                ", price = " + price +
                ", portions = " + portions +
                '}';
    }
}
