package com.company;

public class Main {

    public static void main(String[] args) {
	    GenericItem Analogue = new GenericItem(1,"ItemName", 30, Category.DRESS);
	    GenericItem Item = new GenericItem(2, "Item", 60, Analogue);
	    Item.addAnalogue(Analogue);
	    Analogue.addAnalogue(Item);
	    Item.printAll();
	    Analogue.printAll();

		System.out.println(Analogue.equals(Item));
		System.out.println(Analogue.equals(Analogue.clone(true)));
		System.out.println(Analogue.equals(Analogue));
		System.out.println(Analogue.clone(true));
	}
}
