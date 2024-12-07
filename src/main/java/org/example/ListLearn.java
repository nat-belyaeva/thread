package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListLearn {
    public static void main(String[] args) {
        List<Car> names = getCarNames();
        List<Car> carWithFuel = new ArrayList<>();

        for (Car car : names) {
            if(car.getFuel() > 15) {
                carWithFuel.add(car);
            }
        }
        System.out.println(carWithFuel);
    }


    private static List<Car> getCarNames() {
        List<Car> cars = new ArrayList<Car>() {{
            add(new Car("Nord", 15));
            add(new Car("Kate", 50));
        }};
        return cars;
    }
}
