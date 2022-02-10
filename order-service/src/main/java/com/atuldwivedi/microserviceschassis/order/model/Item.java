package com.atuldwivedi.microserviceschassis.order.model;

import lombok.Data;

/**
 * @author Atul Dwivedi
 */
@Data
public class Item {
    private String itemName;
    private String itemDescription;
    private int qty;
    private Double price;
}
