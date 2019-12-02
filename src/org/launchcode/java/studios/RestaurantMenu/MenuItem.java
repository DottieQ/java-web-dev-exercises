package org.launchcode.java.studios.RestaurantMenu;

import java.util.Date;

public class MenuItem {

    private Integer id;
    private String name;
    private String description;
    private String category;
    private Double price;
    private Date lastUpdateDate;

    public MenuItem(Integer id, String name, String description, String category, Double price, Date lastUpdateDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.lastUpdateDate = lastUpdateDate;
    }

    // addMenuItem (Integer id, String name, String description, String category, Double price)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getDescription () {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String toString() {
        return "\n {" +
                "name='" + name + '\'' +
                ", description'" + description + '\'' +
                ", category'" + category + '\'' +
                ", price'" + price + '\'' +
                ", lastUpdateDate'" + lastUpdateDate + '\'' +
                "}";
    }
}
