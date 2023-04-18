package entity;

public class Moto{
    String licencePlate;

    public Moto(String licencePlate){
        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "licencePlate='" + licencePlate + '\'' +
                '}';
    }
}
