package org.launchcode;

import java.util.ArrayList;

public class DVD extends DataDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public DVD(String name, String type, double storageCapacity) {
        super(name, type, storageCapacity);
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getType() + " " + this.getDiscFiles() + " " + this.getStorageCapacity();
    }

    @Override
    public void SpinDisk() {
        System.out.println("Spinning so fast like really fast");
    }

    @Override
    public void Store() {
        System.out.println("Storing more than the CD");
    }

    @Override
    public void WriteTo() {
        System.out.println("Write Succesful");
    }

    @Override
    public void ReadFrom() {
        System.out.println("Ya did it");
    }

    @Override
    public void Report() {
        System.out.println("All good on the western front");
    }

    @Override
    public void ReWrite() {
        System.out.println("All bad on the western front");
    }
}
