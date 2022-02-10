package com.atuldwivedi.microserviceschassis.order.model;

import lombok.Data;

/**
 * @author Atul Dwivedi
 */
@Data
public class Order {
    private String orderId;
    private String itemName;
    private int qty;
}
