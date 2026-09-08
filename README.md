# VehicleApp

A simple Java console application that demonstrates core **Object-Oriented Programming (OOP)** concepts — interfaces, abstract classes, inheritance, method overriding, encapsulation, and static members — using a small vehicle simulation.

## Overview

The app models land vehicles and simulates basic driving behavior:

- A **`Vehicle` interface** defines the contract: `start()`, `stop()`, `accelerate(speed)`, and `decelerate(speed)`.
- An **abstract `LandVehicle` class** implements the interface and holds shared state (`make`, `model`, `year`, `speed`, `isMoving`) plus a static counter that tracks the total number of vehicles created.
- **Concrete subclasses** (`Car`, `Motorcycle`) extend `LandVehicle` and override the driving methods with their own behavior.
- The **`VehicleApp` main class** instantiates a `Toyota Camry` car and a `Yamaha Y-15` motorcycle, drives them, and prints the total vehicle count.

## Class Hierarchy

```
        Vehicle (interface)
              ▲
              │ implements
        LandVehicle (abstract)
          ▲         ▲
          │         │
        Car    Motorcycle
```

### OOP Concepts Demonstrated

| Concept | Where |
|---|---|
| Interface | `Vehicle` |
| Abstract class | `LandVehicle` |
| Inheritance | `Car`, `Motorcycle` extend `LandVehicle` |
| Method overriding | `start()`, `stop()`, `accelerate()`, `decelerate()` |
| Encapsulation | `private` fields with setter methods (`setAirConditioner`, `setHelmet`) |
| Static members | `numberOfVehicles` counter and `getNumberOfVehicles()` |
| Constructor chaining | `super(make, model, year)` calls |

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or later

### Compile and Run

```bash
cd src
javac VehicleApp.java
java VehicleApp
```

### Expected Output

```
Toyota Camry Car has started.
Toyota Camry Car accelerated to 60.0 km/h.
Toyota Camry Car decelerated to 40.0 km/h.
Toyota Camry Car has stopped.
Yamaha Y-15 Motorcycle has started.
Yamaha Y-15 Motorcycle accelerated to 150.0 km/h.
Yamaha Y-15 Motorcycle decelerated to 70.0 km/h.
Yamaha Y-15 Motorcycle has stopped.
Total number of vehicles instantiated: 2
```

## Project Structure

```
VehicleApp/
├── src/
│   └── VehicleApp.java    # All classes (interface, abstract class, subclasses, main)
├── .idea/                 # IDE configuration
└── .gitignore
```
