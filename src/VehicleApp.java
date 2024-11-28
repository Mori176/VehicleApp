interface Vehicle {
    void start(); //Abstract Method
    void stop();
    void accelerate(double speed);
    void decelerate(double speed);
}

// Abstract Class: LandVehicle
abstract class LandVehicle implements Vehicle {
    protected String make; //Store the brand/manufacturer (Ex: Toyota)
    protected String model;
    protected int year;
    protected double speed;
    protected boolean isMoving; //Indicate whether the vehicle is moving or not

    // Static variable to count total number of vehicles
    protected static int numberOfVehicles = 0;

    public LandVehicle(String make, String model, int year) { //Constructor
        this.make = make; // Initialize the instance variables
        this.model = model;
        this.year = year;
        this.speed = 0;
        this.isMoving = false;

        numberOfVehicles++;
    }

    public static int getNumberOfVehicles() { //Static Method
        return numberOfVehicles; //Return the total number of vehicles
    }
}

// Concrete Class: Car
class Car extends LandVehicle {
    private int numberOfDoors; //Store the number of doors in the car
    private boolean hasAirConditioner; //Indicate whether the car has an air conditioner or not

    public Car(String make, String model, int year, int numberOfDoors) { //Constructor
        super(make, model, year); //Call the parent class constructor
        this.numberOfDoors = numberOfDoors;// Initialize the instance variables
        this.hasAirConditioner = false;
    }

    public void setAirConditioner(boolean hasAirConditioner) {//Setter Method
        this.hasAirConditioner = hasAirConditioner;
    }

    @Override
    public void start() { //Overriding the abstract method
        isMoving = true; //Set the vehicle to moving state
        System.out.println(make + " " + model + " Car has started."); //Display the message
    }

    @Override
    public void stop() {
        isMoving = false;
        speed = 0.0;
        System.out.println(make + " " + model + " Car has stopped.");
    }

    @Override
    public void accelerate(double speed) {
        this.speed += speed;
        System.out.println(make + " " + model + " Car accelerated to " + this.speed + " km/h.");
    }

    @Override
    public void decelerate(double speed) {
        this.speed -= speed;
        if (this.speed < 0) this.speed = 0;
        System.out.println(make + " " + model + " Car decelerated to " + this.speed + " km/h.");
    }
}

// Concrete Class: Motorcycle
class Motorcycle extends LandVehicle {
    private boolean hasHelmet; //Indicate whether the rider has a helmet or not

    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
        this.hasHelmet = false;
    }

    public void setHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void start() {
        isMoving = true;
        System.out.println(make + " " + model + " Motorcycle has started.");
    }

    @Override
    public void stop() {
        isMoving = false;
        speed = 0.0;
        System.out.println(make + " " + model + " Motorcycle has stopped.");
    }

    @Override
    public void accelerate(double speed) {
        this.speed += speed;
        System.out.println(make + " " + model + " Motorcycle accelerated to " + this.speed + " km/h.");
    }

    @Override
    public void decelerate(double speed) {
        this.speed -= speed;
        if (this.speed < 0) this.speed = 0;
        System.out.println(make + " " + model + " Motorcycle decelerated to " + this.speed + " km/h.");
    }
}

// Main Class: VehicleApp
public class VehicleApp { //Main Class
    public static void main(String[] args) { //Main Method
        // Instantiate Car objects
        Car car1 = new Car("Toyota", "Camry", 2020, 4);


        // Instantiate Motorcycle objects
        Motorcycle bike1 = new Motorcycle("Yamaha", "Y-15", 2024);


        // Interact with Car objects
        car1.setAirConditioner(true);
        car1.start();
        car1.accelerate(60);
        car1.decelerate(20);
        car1.stop();


        // Interact with Motorcycle objects
        bike1.setHelmet(false);
        bike1.start();
        bike1.accelerate(150);
        bike1.decelerate(80);
        bike1.stop();

        // Display total number of vehicles instantiated
        System.out.println("Total number of vehicles instantiated: " + LandVehicle.getNumberOfVehicles());
    }
}
