package factory;

import vehicle.*;

public enum VehicleType {
    BUS{
        @Override
        public Vehicle getVehicle() {
            return new Bus();
        }
    },

    TRUCK{
        @Override
        public Vehicle getVehicle() {
            return new Truck();
        }
    },

    CAR{
        @Override
        public Vehicle getVehicle() {
            return new Car();
        }
    },

    ELECTRIC_CAR{
        @Override
        public Vehicle getVehicle() {
            return new ElectricCar();
        }
    };

    public abstract Vehicle getVehicle();
}
