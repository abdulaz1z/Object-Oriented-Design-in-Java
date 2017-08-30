package client;

import factory.VehicleFactory;
import factory.VehicleType;
import vehicle.Vehicle;

public class App {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle bus = vehicleFactory.getVehicle(VehicleType.BUS);
        bus.startEngine();
    }
}
