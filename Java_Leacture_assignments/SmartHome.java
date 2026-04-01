// Real Life Scenario: Smart Home Device Control System

// In a Smart Home, different devices such as Lights, Fans, and Air Conditioners can be controlled remotely using a mobile app.

// Although these devices are different, they follow a common behavior:

// They can be turned ON

// They can be turned OFF

// To maintain a common structure for all smart devices, the system uses a Java Interface.

// Problem Statement

// Design a Smart Home Device Control System using Java Interface.

// Requirements

// Create an interface named SmartDevice with the following methods:

// void turnOn();

// void turnOff();

// Create the following classes that implement the interface:

// Light

// Fan

// AirConditioner

// Each class should provide its own implementation of turnOn() and turnOff().

// In the main class, create objects for each device and demonstrate how they work using the interface reference

interface SmartDevice {
    void turnOn();
    void turnOff();
}
class Light implements SmartDevice {

    public void turnOn() {
        System.out.println("Light is turned ON");
    }

    public void turnOff() {
        System.out.println("Light is turned OFF");
    }
}
class Fan implements SmartDevice {

    public void turnOn() {
        System.out.println("Fan is turned ON");
    }

    public void turnOff() {
        System.out.println("Fan is turned OFF");
    }
}
class AirConditioner implements SmartDevice {

    public void turnOn() {
        System.out.println("Air Conditioner is turned ON");
    }

    public void turnOff() {
        System.out.println("Air Conditioner is turned OFF");
    }
}
public class SmartHome {

    public static void main(String[] args) {

        SmartDevice d1 = new Light();
        SmartDevice d2 = new Fan();
        SmartDevice d3 = new AirConditioner();

        d1.turnOn();
        d1.turnOff();

        d2.turnOn();
        d2.turnOff();

        d3.turnOn();
        d3.turnOff();
    }
}