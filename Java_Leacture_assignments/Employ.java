// Base Class
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to be overridden
    public double calculateSalary() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Derived Class: Manager
class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    // Overriding method
    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}

// Derived Class: Developer
class Developer extends Employee {
    private int overtimeHours;
    private double overtimeRate;

    public Developer(String name, int id, double salary, int overtimeHours, double overtimeRate) {
        super(name, id, salary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    // Overriding method
    @Override
    public double calculateSalary() {
        return salary + (overtimeHours * overtimeRate);
    }
}

// Derived Class: Intern
class Intern extends Employee {

    public Intern(String name, int id, double stipend) {
        super(name, id, stipend);
    }

    // Overriding method
    @Override
    public double calculateSalary() {
        return salary; // stipend only
    }
}

// Main Class
 class Employ {
    public static void main(String[] args) {

        // Creating objects
        Manager m = new Manager("Amit", 101, 50000, 10000);
        Developer d = new Developer("Ravi", 102, 40000, 10, 500);
        Intern i = new Intern("Neha", 103, 15000);

        // Displaying salary details
        System.out.println("---- Manager ----");
        m.displayInfo();
        System.out.println("Total Salary: " + m.calculateSalary());

        System.out.println("\n---- Developer ----");
        d.displayInfo();
        System.out.println("Total Salary: " + d.calculateSalary());

        System.out.println("\n---- Intern ----");
        i.displayInfo();
        System.out.println("Total Salary: " + i.calculateSalary());
    }
}