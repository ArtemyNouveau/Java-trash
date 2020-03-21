package com.company;

public class Main {

    public static void main(String[] args) {
	    GenericItem Analogue = new GenericItem("ItemName", 30, Category.DRESS);
	    GenericItem Item = new GenericItem("Item", 60, Analogue);
	    Item.addAnalogue(Analogue);
	    Analogue.addAnalogue(Item);
	    Item.printAll();
	    Analogue.printAll();
		System.out.println(Analogue.equals(Item));
		System.out.println(Analogue.equals(Analogue.clone(true)));
		System.out.println(Analogue.equals(Analogue));
		System.out.println(Analogue.clone(true));

		TechnicalItem technicalItem = new TechnicalItem("ItemName", 30, (short) 10);
		technicalItem.printAll();
//
		Number intArr [] = {10,20,15};
		WorkArray array = new WorkArray(intArr);
		System.out.println(array.sum());

		String line = "Конфеты ’Маска’;45;120";
		String itemFields [] = line.split(";");
		FoodItem foodItem = new FoodItem(itemFields[0], Integer.parseInt(itemFields[1]), Short.parseShort(itemFields[2]));
		System.out.println(foodItem.toString());
	}
}
