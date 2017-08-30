package processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {
    public LaptopManufacturingProcess(String pName) {
        super(pName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembling laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("Testing laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaging laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Storing laptop");
    }
}
