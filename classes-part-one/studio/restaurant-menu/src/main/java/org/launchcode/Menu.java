package org.launchcode;

import java.util.ArrayList;

public class Menu {
    private String menuName;
    private ArrayList<MenuItem> items;

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items ) {
        this.items = items;
    }

    public Menu(String menuName) {
        this.menuName = menuName;
    }
}
