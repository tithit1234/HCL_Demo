package com.example.inventory.controller;

import com.example.inventory.dto.InventorySearchDTO;
import com.example.inventory.model.Inventory;
import com.example.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventories")
public class InventoryController {

    @Autowired
    private InventoryService service;

    @GetMapping("/{id}")
    public ResponseEntity<Inventory> getInventoryById(@PathVariable Long id) {
        Inventory inventory = service.findById(id);
        if (inventory != null) {
            return ResponseEntity.ok(inventory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    // NEW: Save inventory endpoint
    @PostMapping("/save")
    public ResponseEntity<Inventory> save(@RequestBody Inventory inventory) {
        Inventory saved = service.save(inventory);
        return ResponseEntity.ok(saved);
    }


    // Existing search endpoint
    @GetMapping("/search")
    public ResponseEntity<List<Inventory>> search(@RequestBody InventorySearchDTO dto) {
        List<Inventory> results = service.search(dto);
        return ResponseEntity.ok(results);
    }

}

