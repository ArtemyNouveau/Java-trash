package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	    GenericItem Analogue = new GenericItem(Objects.hash("ItemName", 30),"ItemName", 30, Category.DRESS);
	    GenericItem Item = new GenericItem(Objects.hash("Item", 60), "Item", 60, Analogue);
	    Item.addAnalogue(Analogue);
	    Analogue.addAnalogue(Item);
	    Item.printAll();
	    Analogue.printAll();
		System.out.println(Analogue.equals(Item));
		System.out.println(Analogue.equals(Analogue.clone(true)));
		System.out.println(Analogue.equals(Analogue));
		System.out.println(Analogue.clone(true));

		TechnicalItem technicalItem = new TechnicalItem(3, "ItemName", 30, (short) 10);
		technicalItem.printAll();
	}
}
