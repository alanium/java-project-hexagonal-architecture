package com.example.application.service.item;

import com.example.domain.model.Item;
import com.example.infrastructure.ports.ItemRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GetItemsBySellerUseCase {

    private final ItemRepositoryPort itemRepository;

    public GetItemsBySellerUseCase(ItemRepositoryPort itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> execute(UUID sellerId) {
        return itemRepository.findBySellerId(sellerId);
    }
}
