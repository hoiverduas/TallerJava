package entity;

import java.util.List;

public class Inventory {
    private List<Tool> tools;
    private int totalAmount;

    public Inventory(List<Tool> tools, int totalAmount){
        this.tools = tools;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "tools=" + tools +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
