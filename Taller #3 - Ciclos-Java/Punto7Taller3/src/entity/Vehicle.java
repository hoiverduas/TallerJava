package entity;

public class Vehicle {

    private String brand;
    private String licensePlate;

    public Vehicle(String brand, String licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
