package entity;

public class Register {

    private Integer registerID;

    private Operator operator;

    private User user ;

    private Decor decor;

    private Sales sales;

    public Register(Integer registerID, Operator operator, User user, Decor decor) {
        this.registerID = registerID;
        this.operator = operator;
        this.user = user;
        this.decor = decor;
    }

    public void setRegisterID(Integer registerID) {
        this.registerID = registerID;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Integer getRegisterID() {
        return registerID;
    }

    public Decor getDecor() {
        return decor;
    }

    @Override
    public String toString() {
        return "Register{" +
                "registerID=" + registerID +
                ", operator=" + operator +
                ", user=" + user +
                ", decor=" + decor +
                ", sales=" + sales +
                '}';
    }
}
