package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class GenericItem {
    private Category category;
    private int ID;
    private String name;
    private float price;
    private ArrayList<GenericItem> analogues;

    public GenericItem(int id, String name, float price) {
        this.ID = id;
        this.name = name;
        this.price = price;
        this.analogues = new ArrayList<GenericItem>();
        this.category = Category.GENERAL;
    }

    public GenericItem(int id, String name, float price, Category category) {
        this(id, name, price);
        this.category = category;
    }

    public GenericItem(int id, String name, float price, GenericItem analogue) {
        this(id, name, price);
        this.analogues.add(analogue);
    }

    public GenericItem(int id, String name, float price, Category category, GenericItem analogue) {
        this(id, name, price, category);
        this.analogues.add(analogue);
    }

    public void addAnalogue(GenericItem analogue) {
        if (this.analogues.contains(analogue)) return;
        this.analogues.add(analogue);
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public int getID() {
        return ID;
    }

    public float getPrice() {
        return price;
    }

    public String getAnalogues() {
        StringBuilder analogues = new StringBuilder();
        for (GenericItem Analogue : this.analogues) {
            analogues.append(Analogue.getName());
        }
        return analogues.toString();
    }

    public void printAll() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Item№: " +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                (this.getAnalogues().length() != 0 ? ", analogues=" + this.getAnalogues() : "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericItem that = (GenericItem) o;
        /*
        lets imagine, that we have some controller, that manages ID
        */
        return ID == that.ID;
    }

    protected Object clone(boolean withAnalogues) {
        GenericItem clone;
        try {
            clone = (GenericItem) super.clone();
        } catch (CloneNotSupportedException e) {
            clone = new GenericItem(ID, name, price, category);
        }

        if (withAnalogues)
            for (GenericItem analogue : analogues)
                clone.analogues.add((GenericItem) analogue.clone(false));


        return clone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
