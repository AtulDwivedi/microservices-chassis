package com.atuldwivedi.microserviceschassis.item.dao;

import com.atuldwivedi.microserviceschassis.item.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Atul Dwivedi
 */
public class BaseDataDao {
    public static List<Item> getItems() {
        List<Item> items = new ArrayList<>();

        String itemName = "ITEM";
        String itemDescription = "Product";

        for (int i = 0; i < 10; i++) {
            Item item = new Item();
            item.setItemName(itemName + " " + (i + 1));
            item.setItemDescription(itemDescription + " " + (i + 1));
            item.setQty((i + 1));
            item.setPrice(Double.valueOf("" + (i + 100)));
            items.add(item);
        }
        return items;
    }
}
