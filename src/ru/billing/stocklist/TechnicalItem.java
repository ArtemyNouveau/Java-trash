package ru.billing.stocklist;

public class TechnicalItem extends GenericItem {
    private short warrantyTime;

    public TechnicalItem(String name, float price, short warrantyTime) {
        super(name, price);
        this.warrantyTime = warrantyTime;
    }

    public TechnicalItem(String name, float price, short warrantyTime, Category category) {
        super(name, price, category);
        this.warrantyTime = warrantyTime;
    }

    public TechnicalItem(String name, float price, short warrantyTime, GenericItem analogue) {
        super(name, price, analogue);
        this.warrantyTime = warrantyTime;
    }

    public TechnicalItem(String name, float price, short warrantyTime, Category category, GenericItem analogue) {
        super(name, price, category, analogue);
        this.warrantyTime = warrantyTime;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", warrantyTime=" + warrantyTime;
    }
}
