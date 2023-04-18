package entity;

public class Decor {


    private String oputtDecor;

    public Decor() {

    }

    public Decor(String oputtDecor) {
        this.oputtDecor = oputtDecor;
    }

    public void setOputtDecor(String oputtDecor) {
        this.oputtDecor = oputtDecor;
    }

    public String getOputtDecor() {
        return oputtDecor;
    }

    @Override
    public String toString() {
        return "Decor{" +
                "oputtDecor='" + oputtDecor + '\'' +
                '}';
    }
}
