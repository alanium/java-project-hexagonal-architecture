package com.example.application.service.item;

import com.example.domain.model.Item;
import com.example.domain.model.User;
import com.example.infrastructure.ports.ItemRepositoryPort;
import com.example.infrastructure.ports.UserRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CreateItemUseCase {

    private final ItemRepositoryPort itemRepository;
    private final UserRepositoryPort userRepository;

    public CreateItemUseCase(ItemRepositoryPort itemRepository, UserRepositoryPort userRepository) {
        this.itemRepository = itemRepository;
        this.userRepository = userRepository;
    }

    public Item execute(Item item, UUID sellerId) {
        User seller = userRepository.findById(sellerId)
                .orElseThrow(() -> new IllegalArgumentException("Seller not found"));

        if (seller.getRole() != User.Role.SELLER) {
            throw new IllegalArgumentException("User is not a seller");
        }

        item.setSeller(seller);
        return itemRepository.save(item);
    }
}
