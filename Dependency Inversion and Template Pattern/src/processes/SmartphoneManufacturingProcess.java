package processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartphoneManufacturingProcess(String pName) {
        super(pName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembling smartPhone");
    }

    @Override
    protected void testDevice() {
        System.out.println("Testing smartPhone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaging smartPhone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Storing smartPhone");
    }
}
