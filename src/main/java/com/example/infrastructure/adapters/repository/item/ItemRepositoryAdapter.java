package com.example.infrastructure.adapters.repository.item;

import com.example.domain.model.Item;
import com.example.infrastructure.ports.ItemRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ItemRepositoryAdapter implements ItemRepositoryPort {

    private final JpaItemRepository jpaItemRepository;

    public ItemRepositoryAdapter(JpaItemRepository jpaItemRepository) {
        this.jpaItemRepository = jpaItemRepository;
    }

    @Override
    public Item save(Item item) {
        return jpaItemRepository.save(item);
    }

    @Override
    public Optional<Item> findById(UUID id) {
        return jpaItemRepository.findById(id);
    }

    @Override
    public List<Item> findAll() {
        return jpaItemRepository.findAll();
    }

    @Override
    public void deleteById(UUID id) {
        jpaItemRepository.deleteById(id);
    }

    @Override
    public List<Item> findBySellerId(UUID sellerId) {
        return jpaItemRepository.findBySellerId(sellerId);
    }
}
