package entity;

public class Contact {

    private String number;

    public Contact(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "number=" + number +
                '}';
    }
}
