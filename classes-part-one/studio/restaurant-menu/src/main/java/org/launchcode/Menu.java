package org.launchcode;

import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> menuFinal = new ArrayList<>();
    MenuItem beans = new MenuItem(12.00, "Just Beans", "Main Course", 21);
    MenuItem iceCream = new MenuItem(7.0, "It's chocolate", "Dessert", 700);
    MenuItem eggs = new MenuItem(3.00, "Bad Egg", "Breakfast", 17);
    {
        menuFinal.add(beans);
        menuFinal.add(iceCream);
        menuFinal.add(eggs);
    }

    public void add(MenuItem newItem) {
        menuFinal.add(newItem);
    }

    public void remove(MenuItem deadItem) {
        menuFinal.remove(deadItem);
    }

    public void menuUpdate() {
        int newest = 100000;
        for (int i = 0; i < this.menuFinal.size(); i++) {
            if (this.menuFinal.get(i).getDaysSinceAdded() < newest) {
                newest = this.menuFinal.get(i).getDaysSinceAdded();
            }
        }
        System.out.println("It's been " + newest + " days since we updated our menu!");
    }
}
