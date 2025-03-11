package com.example.infrastructure.adapters.repository.item;

import com.example.domain.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface JpaItemRepository extends JpaRepository<Item, UUID> {
    List<Item> findBySellerId(UUID sellerId);
}
