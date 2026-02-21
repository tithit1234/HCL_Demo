package com.example.inventory.controller;

import com.example.inventory.dto.InventorySearchDTO;
import com.example.inventory.model.Inventory;
import com.example.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/inventories")
public class InventoryController {

    @Autowired
    private InventoryService service;

    @PostMapping("/search")
    public ResponseEntity<List<Inventory>> search(@RequestBody InventorySearchDTO dto) {
        List<Inventory> results = service.search(dto);
        return ResponseEntity.ok(results);
    }
}
