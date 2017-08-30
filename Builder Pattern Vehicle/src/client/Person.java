package client;

import domain.Vehicle;

public class Person {
    public static void main(String[] args) {
        Vehicle car = new Vehicle.Builder()
                .type("car")
                .make("Honda")
                .model("Accord")
                .price(23000.00)
                .color("black")
                .doors(4)
                .horsePower(200)
                .build();
        System.out.println(car.toString());
    }
}
