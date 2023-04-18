package entity;

public class Operator {

    private String nameOperator;

    public Operator(String nameOperator) {
        this.nameOperator = nameOperator;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "nameOperator='" + nameOperator + '\'' +
                '}';
    }
}
