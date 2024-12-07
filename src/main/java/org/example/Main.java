package org.example;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        String name = "Nat";
        int age = 25;
        String formattedName = String.format("My name is %s and  my age is %d", name, age);

        String replaceString = formattedName.replaceAll("Nat", "Felix");
        String replaceStringRegex = formattedName.replaceAll("\\d+", "30");
        System.out.println(replaceString);
        System.out.println(replaceStringRegex);

        Car car = new Car();
        car.beepBeep();
        car.setFuel(100);
        car.setModel("Nissan");
        car.goToRoad();
        System.out.println(car.getModel());

        Car car2 = new Car();
        car2.setModel("BMW");
        car2.setFuel(10);
        car2.goToRoad();
        System.out.println(car2.getModel());

        Car mersedez = new Car("Mers Gelik", 100);
        System.out.println(mersedez.getModel());
        mersedez.goToRoad();

        Car nissan = new Car("Nussan Q", 40);
        Car nissan2 = new Car("Nussan Q", 40);
        
        boolean isSame = nissan.equals(nissan2);
        boolean isModelSame = nissan.getModel().equals(nissan2.getModel());
        System.out.println(isSame);
        System.out.println(isModelSame);
        System.out.println(nissan);

        Lion lion = new Lion();
        lion.say();
        lion.hunt();
        Panter panter = new Panter();
        panter.say();
        panter.hunt();
        lion.fly();*/
        Car[] cars = new Car[3];
        cars[0] = new Car("Tesla", 60);
        cars[1]  = new Car("BMW", 23);
        cars[2] = new Car("Honda", 89);
        System.out.println(cars[2].getModel());

        for (int i = 0; i < cars.length; i++) {
         Car tempCar = cars[i];
         if(tempCar.getModel().equals("Honda")){
             System.out.println("Done");
             break;
         }
            System.out.println(tempCar);
        }

        for (int i = cars.length - 1; i >= 0; i--) {
            Car tempCar = cars[i];
            if(tempCar.getModel() == "BMW") {
                tempCar.setFuel(0);
            }
        }
        System.out.println(Arrays.toString(cars));
    }
}