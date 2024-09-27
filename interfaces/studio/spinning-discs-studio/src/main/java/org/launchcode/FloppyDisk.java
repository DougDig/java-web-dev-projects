package org.launchcode;

public class FloppyDisk extends DataDisc implements OpticalDisc{

    public FloppyDisk(String name, String type, double storageCapacity) {
        super(name, type, storageCapacity);
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getType() + " " + this.getDiscFiles() + " " + this.getStorageCapacity();
    }

    @Override
    public void SpinDisk() {
        System.out.println("real slow");
    }

    @Override
    public void Store() {

    }

    @Override
    public void WriteTo() {

    }

    @Override
    public void ReadFrom() {

    }

    @Override
    public void Report() {

    }

    @Override
    public void ReWrite() {

    }
}
