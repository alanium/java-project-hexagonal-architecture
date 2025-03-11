package com.example.application.service.item;

import com.example.domain.model.Item;
import com.example.infrastructure.ports.ItemRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GetItemUseCase {

    private final ItemRepositoryPort itemRepository;

    public GetItemUseCase(ItemRepositoryPort itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Optional<Item> execute(UUID itemId) {
        return itemRepository.findById(itemId);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}
