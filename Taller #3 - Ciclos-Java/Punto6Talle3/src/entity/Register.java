package entity;

public class Register {


    private String registerID;
    private User user;
    private Contact contact;

    public Register(String registerID, User user, Contact contact) {
        this.registerID = registerID;
        this.user = user;
        this.contact = contact;
    }

    public String getRegisterID() {
        return registerID;
    }

    @Override
    public String toString() {
        return "Register{" +
                "registerID='" + registerID + '\'' +
                ", user=" + user +
                ", contact=" + contact +
                '}';
    }
}
