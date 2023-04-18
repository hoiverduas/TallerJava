package entity;

public class Tool {
    private  String refID;
    private String toolDescription;
    private Integer price;

    public Integer getPrice() {
        return price;
    }

    public Tool(String refID, String toolDescription, Integer price){
        this.refID = refID;
        this.toolDescription = toolDescription;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "refID='" + refID + '\'' +
                ", toolDescription='" + toolDescription + '\'' +
                ", price=" + price +
                '}';
    }
}
