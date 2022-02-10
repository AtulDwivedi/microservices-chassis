package com.atuldwivedi.microserviceschassis.item.rest;

import com.atuldwivedi.microserviceschassis.item.dao.BaseDataDao;
import com.atuldwivedi.microserviceschassis.item.model.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Atul Dwivedi
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/items")
public class ItemController {
    public List<Item> getItems() {
        log.info("Getting items");
        return BaseDataDao.getItems();
    }
}
