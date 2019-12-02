package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String toString() {
        return "Menu{" + "menuItems=" + menuItems + '}';
    }

}
