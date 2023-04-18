package entity;

public class Register {

    private Integer registerID;

    private User user;

    private Operator operator;

    private ProductSale productSale;

    public Register(Integer registerID, User user, Operator operator) {
        this.registerID = registerID;
        this.user = user;
        this.operator = operator;
    }


    public Integer getRegisterID() {
        return registerID;
    }

    public void setRegisterID(Integer registerID) {
        this.registerID = registerID;
    }

    public void setProductSale(ProductSale productSale) {
        this.productSale = productSale;
    }


    @Override
    public String toString() {
        return "Register{" +
                "registerID=" + registerID +
                ", user=" + user +
                ", operator=" + operator +
                ", productSale=" + productSale +
                '}';
    }
}
