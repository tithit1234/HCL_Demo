package com.example.inventory.service;

import com.example.inventory.dto.InventorySearchDTO;
import com.example.inventory.model.Inventory;
import com.example.inventory.repository.InventoryRepository;
import com.example.inventory.specification.InventorySpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository repository;

    public List<Inventory> search(InventorySearchDTO dto) {
        return repository.findAll(InventorySpecification.filter(dto));
    }
}
