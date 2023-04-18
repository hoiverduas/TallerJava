package entity;

import java.util.List;

public class Sales {
    private List<Cake> cakes;
    private int totalAmount;


    public Sales(List<Cake> cakes, int totalAmount) {
        this.cakes = cakes;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "cakes=" + cakes +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
