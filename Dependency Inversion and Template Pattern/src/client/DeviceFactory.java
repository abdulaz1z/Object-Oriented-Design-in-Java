package client;

import processes.GeneralManufacturingProcess;
import processes.LaptopManufacturingProcess;
import processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess sp = new SmartphoneManufacturingProcess("iPhone");
        sp.launchProcess();

        GeneralManufacturingProcess l = new LaptopManufacturingProcess("iMac");
        l.launchProcess();
    }
}


