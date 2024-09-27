package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    CD Believer = new CD("Believer","Musical Disc", 280.2);
    DVD JurasicPark = new DVD("DinosaurMovie", "Movie DvD", 5545535.1);
    FloppyDisk frogger = new FloppyDisk("it's the 90s", "shareware", 1.4);
    LP morrison = new LP("songs","more songs");
        ArrayList<String> puppies = new ArrayList<>();
        puppies.add("dalmation");
        puppies.add("pug");
        Believer.setDiscFiles(puppies);
        System.out.println(Believer);
        puppies.add("bloodhound");
        JurasicPark.setDiscFiles(puppies);
        Believer.SpinDisk();
        JurasicPark.SpinDisk();
        System.out.println(frogger);
        System.out.println(morrison);



        System.out.println(JurasicPark);

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}