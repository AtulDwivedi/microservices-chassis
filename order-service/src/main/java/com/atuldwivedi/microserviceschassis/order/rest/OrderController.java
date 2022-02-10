package com.atuldwivedi.microserviceschassis.order.rest;

import com.atuldwivedi.microserviceschassis.order.feign.ItemServiceProvider;
import com.atuldwivedi.microserviceschassis.order.model.Item;
import com.atuldwivedi.microserviceschassis.order.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author Atul Dwivedi
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private ItemServiceProvider itemServiceProvider;

    @GetMapping("/{item}/{qty}")
    public Order placeOrder(@PathVariable("item") String itemName, @PathVariable("qty") int qty) {
        List<Item> items = itemServiceProvider.getItems();
        log.info("All items: {}", items);
        String orderId = UUID.randomUUID().toString();
        Order order = new Order();
        order.setOrderId(orderId);
        order.setItemName(itemName);
        order.setQty(qty);
        return order;
    }
}
