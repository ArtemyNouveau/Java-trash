package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.ItemCatalog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

class CatalogFileLoader implements CatalogLoader {
    private String filename;

    public CatalogFileLoader(String filename) {
        this.filename = filename;
    }

    @Override
    public void load(ItemCatalog catalog) throws CatalogLoadException {
        File file = new File(filename);
        String line;
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (line.length() == 0)
                    break;
                String[] itemFields = line.split(";");
                String name = itemFields[0];
                float price = Float.parseFloat(itemFields[1]);
                short expires = Short.parseShort(itemFields[2]);
                FoodItem item = new FoodItem(name, price, new Date(), expires);
                catalog.addItem(item);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new CatalogLoadException();
        } catch (ItemAlreadyExistsException e) {
            e.printStackTrace();
        }
    }

}
