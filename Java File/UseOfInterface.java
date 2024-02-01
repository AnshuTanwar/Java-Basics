// Define the Car interface for common car features
interface Car {
    void start();
    void accelerate();
    void brake();
    void stop();
}

// Create a class for Supercars that implements the Car interface
class Supercar implements Car {
    private String make;
    private String model;

    Supercar(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Starting " + make + " " + model);
    }

    @Override
    public void accelerate() {
        System.out.println(make + " " + model + " is accelerating");
    }

    @Override
    public void brake() {
        System.out.println(make + " " + model + " is braking");
    }

    @Override
    public void stop() {
        System.out.println(make + " " + model + " has stopped");
    }
}

public class UseOfInterface {
    public static void main(String[] args) {
        Supercar huracan = new Supercar("Lamborghini", "Huracan");

        huracan.start();
        huracan.accelerate();
        huracan.brake();
        huracan.stop();
    }
}
