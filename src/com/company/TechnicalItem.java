package com.company;

public class TechnicalItem extends GenericItem {
    private short warrantyTime;

    public TechnicalItem(int id, String name, float price, short warrantyTime) {
        super(id, name, price);
        this.warrantyTime = warrantyTime;
    }

    public TechnicalItem(int id, String name, float price, short warrantyTime, Category category) {
        super(id, name, price, category);
        this.warrantyTime = warrantyTime;
    }

    public TechnicalItem(int id, String name, float price, short warrantyTime, GenericItem analogue) {
        super(id, name, price, analogue);
        this.warrantyTime = warrantyTime;
    }

    public TechnicalItem(int id, String name, float price, short warrantyTime, Category category, GenericItem analogue) {
        super(id, name, price, category, analogue);
        this.warrantyTime = warrantyTime;
    }
}
