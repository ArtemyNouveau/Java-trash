package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
		ItemCatalog Catalog = new ItemCatalog();

		try {
			Catalog.addItem(new GenericItem(), new GenericItem(), new GenericItem(), new GenericItem(), new GenericItem(),
					new GenericItem(), new GenericItem(), new GenericItem(), new GenericItem(), new GenericItem());
		} catch (ItemAlreadyExistsException e) {
			e.printStackTrace();
		}

		System.out.println("1)");
		Catalog.printItems();

		long begin = new Date().getTime();
		for (int i = 0; i < 100_000; i++) {
			Catalog.findItemById(10);
		}
		long end = new Date().getTime();
		System.out.println("In HashMap: " + (end - begin));

		begin = new Date().getTime();
		for (int i = 0; i < 100_000; i++) {
			Catalog.findItemByIdAL(10);
		}
		end = new Date().getTime();
		System.out.println("In ArrayList: " + (end - begin));


		CatalogLoader loader = new CatalogStubLoader();
		try {
			loader.load(Catalog);
		} catch (CatalogLoadException e) {
			e.printStackTrace();
		}

		System.out.println("2)");
		Catalog.printItems();
	}
}
