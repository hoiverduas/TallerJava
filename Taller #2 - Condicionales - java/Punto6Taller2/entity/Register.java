package entity;



public class Register {
    private Integer registerID;
    private Operator operator;
    private User user;
    private Observation observation;

    private Inventory inventory;

    public Integer getRegisterID() {
        return registerID;
    }

    public Observation getObservation(){
        return this.observation;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Register(Integer registerID, Operator operator, User user, Observation observation){
        this.registerID = registerID;
        this.operator = operator;
        this.user = user;
        this.observation = observation;
    }


    @Override
    public String toString() {
        return "Register{" +
                "registerID=" + registerID +
                ", operator=" + operator +
                ", user=" + user +
                ", observation=" + observation +
                ", inventory=" + inventory +
                '}';
    }
}

