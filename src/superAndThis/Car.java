package superAndThis;

class Car extends Vehicle implements Drivable {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Car starting...");
    }

    @Override
    public void drive() {
        System.out.println("Car driving...");
    }
}
