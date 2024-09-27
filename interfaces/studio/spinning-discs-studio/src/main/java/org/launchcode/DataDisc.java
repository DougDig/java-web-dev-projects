package org.launchcode;

import java.util.ArrayList;

public abstract class DataDisc extends BaseDisc{
    private double storageCapacity;

    private ArrayList<String> discFiles = new ArrayList<>();

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public ArrayList<String> getDiscFiles() {
        return discFiles;
    }

    @Override
    public String toString() {
        return "DataDisc{" +
                "storageCapacity=" + storageCapacity +
                ", discFiles=" + discFiles +
                '}';
    }

    public void setDiscFiles(ArrayList<String> discFiles) {
        this.discFiles = discFiles;
    }

    public void eject() {
        System.out.print("Ejected");
    }

    public DataDisc(String name, String type, double storageCapacity) {
        super(name, type);
        this.storageCapacity = storageCapacity;
        this.discFiles = discFiles;
    }
}
