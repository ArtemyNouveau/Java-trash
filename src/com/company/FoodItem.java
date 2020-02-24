package com.company;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private short expires;

    public FoodItem(int id, String name, float price, Date dateOfIncome, short expires) {
        super(id, name, price);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    public FoodItem(int id, String name, float price, Date dateOfIncome, short expires, Category category) {
        super(id, name, price, category);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    public FoodItem(int id, String name, float price, Date dateOfIncome, short expires, GenericItem analogue) {
        super(id, name, price, analogue);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    public FoodItem(int id, String name, float price, Date dateOfIncome, short expires, Category category, GenericItem analogue) {
        super(id, name, price, category, analogue);
        this.dateOfIncome = dateOfIncome;
        this.expires = expires;
    }

    @Override
    public String toString() {
        return ", dateOfIncome=" + dateOfIncome +
                ", expires=" + expires;
    }
}
