package entity;

public class Register {

    private Integer registerID;
    private Operator operador;
    private User user;
    private Vehicle vehiculo;

    private int entryTime;

    private int departureTime;
    private  int price;





    public Register(Integer registerID, Operator operador, User user, Vehicle vehiculo) {
        this.registerID = registerID;
        this.operador = operador;
        this.user = user;
        this.vehiculo = vehiculo;
    }



    public Integer getRegisterID() {
        return registerID;
    }

    public int getPrice() {
        return price;
    }

    public void setEntryTime(int entryTime) {
        this.entryTime = entryTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEntryTime() {
        return entryTime;
    }




    public int getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Register{" +
                "registerID=" + registerID +
                ", operador=" + operador +
                ", user=" + user +
                ", vehiculo=" + vehiculo +
                ", entryTime=" + entryTime +
                ", departureTime=" + departureTime +
                ", price=" + price +
                '}';
    }
}
