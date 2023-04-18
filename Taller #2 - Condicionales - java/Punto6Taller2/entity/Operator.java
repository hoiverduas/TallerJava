package entity;

public class Operator{
    private String name;

    public Operator(String name){
        this.name = name;
    }

    public String GetName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                '}';
    }
}