package superAndThis;

abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void start();

    public void displayInfo() {
        System.out.println("Vehicle Brand: " + brand);
    }
}
