package com.example.inventory.specification;

import com.example.inventory.dto.InventorySearchDTO;
import com.example.inventory.model.Inventory;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Predicate;

public class InventorySpecification {

    public static Specification<Inventory> filter(InventorySearchDTO dto) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (dto.getName() != null) {
                predicates.add(cb.like(root.get("name"), "%" + dto.getName() + "%"));
            }
            if (dto.getCategory() != null) {
                predicates.add(cb.equal(root.get("category"), dto.getCategory()));
            }
            if (dto.getPrice() != null) {
                predicates.add(cb.equal(root.get("price"), dto.getPrice()));
            }
            if (dto.getLocation() != null) {
                predicates.add(cb.equal(root.get("location"), dto.getLocation()));
            }
            // Add more filters as needed

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}
