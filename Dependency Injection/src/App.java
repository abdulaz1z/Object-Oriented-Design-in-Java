public class App {

    public static void main(String[] args) {
        Vehicle raceCar = new Vehicle(new LargeEngine(500));
        raceCar.crankIgnition();
    }

}
