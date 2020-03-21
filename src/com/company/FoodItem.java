package com.company;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private short expires;

    public FoodItem(String name, float price, short expires) {
        super(name, price);
        this.dateOfIncome = new Date();
        this.expires = expires;
    }

    public FoodItem(String name, float price, Date dateOfIncome, short expires) {
        super(name, price);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    public FoodItem(String name, float price, Date dateOfIncome, short expires, Category category) {
        super(name, price, category);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    public FoodItem(String name, float price, Date dateOfIncome, short expires, GenericItem analogue) {
        super(name, price, analogue);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    public FoodItem(String name, float price, Date dateOfIncome, short expires, Category category, GenericItem analogue) {
        super(name, price, category, analogue);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", dateOfIncome=" + dateOfIncome +
                ", expires=" + expires;
    }
}
