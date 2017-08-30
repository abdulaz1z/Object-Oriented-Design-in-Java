package domain;

public class Vehicle {
    private String type;
    private String model;
    private String make;
    private Double price;
    private String color;
    private int numOfDoor;
    private int horsePower;

    private Vehicle(Builder b){
        this.type = b.type;
        this.model = b.model;
        this.make = b.make;
        this.price = b.price;
        this.color = b.color;
        this.numOfDoor = b.numOfDoor;
        this.horsePower = b.horsePower;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", numOfDoor=" + numOfDoor +
                ", horsePower=" + horsePower +
                '}';
    }

    //Builder class with same field variable as User class
    public static class Builder{
        private String type;
        private String model;
        private String make;
        private Double price;
        private String color;
        private int numOfDoor;
        private int horsePower;

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }

        public Builder make(String make){
            this.make = make;
            return this;
        }

        public Builder price(Double price){
            this.price = price;
            return this;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Builder doors(int numOfDoor){
            this.numOfDoor = numOfDoor;
            return this;
        }

        public Builder horsePower(int horsePower){
            this.horsePower = horsePower;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }

    }
}
