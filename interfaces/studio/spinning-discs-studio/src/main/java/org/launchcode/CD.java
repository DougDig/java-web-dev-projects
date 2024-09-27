package org.launchcode;

import java.util.ArrayList;

public class CD extends  DataDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    public CD(String name, String type, double storageCapacity) {
        super(name, type, storageCapacity);
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getType() + " " + this.getDiscFiles() + " " + this.getStorageCapacity();
    }

    @Override
    public void SpinDisk() {
        System.out.println("Spinning really fast");
    }

    @Override
    public void Store() {
        System.out.println("It's in there now");
    }

    @Override
    public void WriteTo() {
        System.out.println("thanks for writing to me");
    }

    @Override
    public void ReadFrom() {
        System.out.println("not enough people read these days");
    }

    @Override
    public void Report() {
        System.out.println("Bang Bang");
    }

    @Override
    public void ReWrite() {
        System.out.println("the first draft was poor");
    }
}
