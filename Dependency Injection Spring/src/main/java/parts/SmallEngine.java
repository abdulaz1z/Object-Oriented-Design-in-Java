package parts;

public class SmallEngine implements Engine {
    private String horsePower;

    public SmallEngine(String horsePower) {
        this.horsePower = horsePower;
    }

    public void startEngine() {
        System.out.println("started small " + horsePower + " hp engine");
    }
}
