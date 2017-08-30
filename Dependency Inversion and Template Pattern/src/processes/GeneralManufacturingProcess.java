package processes;

public abstract class GeneralManufacturingProcess {
    private String pName = null;

    public GeneralManufacturingProcess(String pName) {
        this.pName = pName;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    public void launchProcess(){
        if(pName != null && !pName.isEmpty()){
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        }
    }
}
