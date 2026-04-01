// Base Class
class Vehicle {
    protected int speed;
    protected String fuelType;

    // Constructor
    public Vehicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Common Methods
    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }

    public void displayInfo() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Derived Class: Car
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int speed, String fuelType, int numberOfDoors) {
        super(speed, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    // Method Overriding
    @Override
    public void start() {
        System.out.println("Car starts with a key or push button.");
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Derived Class: Bike
class Bike extends Vehicle {
    private boolean helmetRequired;

    public Bike(int speed, String fuelType, boolean helmetRequired) {
        super(speed, fuelType);
        this.helmetRequired = helmetRequired;
    }

    // Method Overriding
    @Override
    public void start() {
        System.out.println("Bike starts with a kick or self-start.");
    }

    public void displayBikeInfo() {
        displayInfo();
        System.out.println("Helmet Required: " + helmetRequired);
    }
}

// Derived Class: Truck
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(int speed, String fuelType, double loadCapacity) {
        super(speed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Method Overriding
    @Override
    public void start() {
        System.out.println("Truck starts with heavy-duty ignition system.");
    }

    public void displayTruckInfo() {
        displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Main Class
 class Vehical {
    public static void main(String[] args) {

        // Creating objects
        Car car = new Car(120, "Petrol", 4);
        Bike bike = new Bike(80, "Petrol", true);
        Truck truck = new Truck(60, "Diesel", 10.5);

        System.out.println("---- Car Details ----");
        car.start();
        car.displayCarInfo();
        car.stop();

        System.out.println("\n---- Bike Details ----");
        bike.start();
        bike.displayBikeInfo();
        bike.stop();

        System.out.println("\n---- Truck Details ----");
        truck.start();
        truck.displayTruckInfo();
        truck.stop();
    }
}