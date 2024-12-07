package org.example;

import java.util.Objects;

public class Car {
    private String model;
    private int fuel;
    public void beepBeep() {
        System.out.println("The car is beeped");
    }

    public Car(String model, int fuel) {
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
    }

    public void goToRoad() {
        if (fuel > 20) {
            System.out.println("The car is going to the road" + "last fuel " + fuel);
            fuel = fuel - 15;
        } else {
            System.out.println("Petrol is not enough");
            addFuelToCar();
            System.out.println("The car is full and go!");
        }
    }

    private void addFuelToCar() {
        fuel = fuel + 20;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fuel == car.fuel && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, fuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
