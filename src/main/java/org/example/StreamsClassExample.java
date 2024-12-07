package org.example;

public class StreamsClassExample {
    public static void main(String[] args) {
        CarWithEnum bmw = new CarWithEnum("BMW x5", TypeCar.CROSSOVER, "red", 5);

        if(!bmw.getType().equals(TypeCar.SEDAN)) {
            System.out.println("error");
        } else {
            System.out.println("success");
        }
    }
}
