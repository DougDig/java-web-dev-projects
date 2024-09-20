package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
         Menu offerings = new Menu();

         System.out.println(offerings.beans.getDescription());
         offerings.beans.is_new();
         System.out.println(offerings.iceCream.getCategory());
         MenuItem beer = new MenuItem(11.0,"The Wettest", "Dessert", 2);

        offerings.add(beer);

//        System.out.println(offerings.menuFinal.get(3).getDescription());

        offerings.remove(beer);
        offerings.remove(offerings.beans);

        offerings.menuUpdate();

        for (int i = 0; i < offerings.menuFinal.size(); i++) {
            System.out.println(offerings.menuFinal.get(i).getDescription());
        }
    }
}