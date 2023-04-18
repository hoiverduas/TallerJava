package entity;

public class Operator {

    private String name;

    public Operator(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                '}';
    }
}
