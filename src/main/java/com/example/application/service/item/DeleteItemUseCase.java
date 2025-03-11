package com.example.application.service.item;

import com.example.infrastructure.ports.ItemRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteItemUseCase {

    private final ItemRepositoryPort itemRepository;

    public DeleteItemUseCase(ItemRepositoryPort itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void execute(UUID itemId) {
        itemRepository.deleteById(itemId);
    }
}
