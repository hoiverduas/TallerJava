package entity;

public class User{
    private String name;
    private Moto moto;

    public User(String name, Moto moto){
        this.name = name;
        this.moto = moto;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", moto=" + moto +
                '}';
    }
}