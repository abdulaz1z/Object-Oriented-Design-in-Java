public class Vehicle {

    //this is a problem b/c we are hard coding the dependency with a specific implementation
    //every time we instantiate a vehicle object we will have the same implementation
    //Engine racingEngine = new LargeEngine(500);

    //solved below
    Engine myEngine;

    public Vehicle(Engine myEngine) {
        this.myEngine = myEngine;
    }
    //ends here

    public void crankIgnition(){
        myEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}
