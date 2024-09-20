package org.launchcode;

public class MenuItem {

    private Double price;
    private String description;
    private String category;
    private final int daysSinceAdded;

    MenuItem(Double price, String description, String category, int daysSinceAdded){
        this.price = price;
        this.description = description;
        this.category = category;
        this.daysSinceAdded = daysSinceAdded;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDaysSinceAdded() {
        return daysSinceAdded;
    }

    public void is_new() {
       if (this.getDaysSinceAdded() < 30) {
        System.out.println("This item is New!");
       }
    }
}