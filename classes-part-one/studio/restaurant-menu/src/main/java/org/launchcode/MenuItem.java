package org.launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String category;
    private String description;
    private boolean isNew;
    private boolean isOutOfStock;

    public MenuItem(String name, double price, String category, String description, boolean isNew,
                    boolean isOutOfStock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.isNew = isNew;
        this.isOutOfStock = isOutOfStock;
    }
}
