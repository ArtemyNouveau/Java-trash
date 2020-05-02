package ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private short expires;

    public FoodItem(String name, float price, short expires) {
        super(name, price, Category.FOOD);
        this.dateOfIncome = new Date();
        this.expires = expires;
    }

    public FoodItem(String name, float price, Date dateOfIncome, short expires) {
        this(name, price, expires);
        this.dateOfIncome = dateOfIncome;
    }

    public FoodItem (String name) {
        this(name, 0, (short) 0);
    }

    public FoodItem(String name, float price, Date dateOfIncome, short expires, GenericItem analogue) {
        this(name, price, expires);
        this.analogues.add(analogue);
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
