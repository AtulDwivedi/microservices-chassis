package com.atuldwivedi.microserviceschassis.order.feign;

import com.atuldwivedi.microserviceschassis.order.model.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Atul Dwivedi
 */
@FeignClient(name = "item-service", url = "${item-service.url}")
public interface ItemServiceProvider {
    @GetMapping("/api/v1/items")
    public List<Item> getItems();
}
