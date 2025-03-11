package com.example.infrastructure.controller.item;

import com.example.application.service.item.CreateItemUseCase;
import com.example.application.service.item.DeleteItemUseCase;
import com.example.application.service.item.GetItemUseCase;
import com.example.application.service.item.GetItemsBySellerUseCase;
import com.example.domain.model.Item;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final GetItemUseCase getItemUseCase;
    private final CreateItemUseCase createItemUseCase;
    private final DeleteItemUseCase deleteItemUseCase;
    private final GetItemsBySellerUseCase getItemsBySellerUseCase;

    public ItemController(GetItemUseCase getItemUseCase, CreateItemUseCase createItemUseCase, DeleteItemUseCase deleteItemUseCase, GetItemsBySellerUseCase getItemsBySellerUseCase) {
        this.getItemUseCase = getItemUseCase;
        this.createItemUseCase = createItemUseCase;
        this.deleteItemUseCase = deleteItemUseCase;
        this.getItemsBySellerUseCase = getItemsBySellerUseCase;
    }

    @PostMapping
    public Item createItem(@RequestBody CreateItemRequest request) {
        return createItemUseCase.execute(request.getItem(), request.getSellerId());
    }

    @GetMapping("/{id}")
    public Optional<Item> getItem(@PathVariable UUID id) {
        return getItemUseCase.execute(id);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return getItemUseCase.getAllItems();
    }

    @GetMapping("/seller/{sellerId}")
    public List<Item> getItemsBySeller(@PathVariable UUID sellerId) {
        return getItemsBySellerUseCase.execute(sellerId);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable UUID id) {
        deleteItemUseCase.execute(id);
    }

    @Getter
    public static class CreateItemRequest {
        private Item item;
        private UUID sellerId;

    }
}
