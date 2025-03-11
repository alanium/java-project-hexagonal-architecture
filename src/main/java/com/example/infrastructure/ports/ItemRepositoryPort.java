package com.example.infrastructure.ports;

import com.example.domain.model.Item;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ItemRepositoryPort {
    Item save(Item item);
    Optional<Item> findById(UUID id);
    List<Item> findAll();
    void deleteById(UUID id);
    List<Item> findBySellerId(UUID sellerId);
}
