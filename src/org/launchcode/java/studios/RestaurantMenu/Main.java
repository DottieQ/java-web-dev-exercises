package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu ();

        ArrayList<MenuItem> menuItems = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem(1, "Fried Pickles", "Heaven on Earth", "Appitzers", 6.99, new Date());
        menuItems.add(menuItem1);

        MenuItem menuItem2 = new MenuItem(2, "Big Sandwich", "The biggest sandwich you've ever seen", "Sandwiches", 12.99, new Date());
        menuItems.add(menuItem2);

        MenuItem menuItem3 = new MenuItem(3, "Chocolate", "Yup, just chocolate.", "Desserts", 8.99, new Date());
        menuItems.add(menuItem3);

        menu.setMenuItems(menuItems);

        System.out.println(menu);

    }
}
