package com.tareq.restApi.controller;

import com.tareq.restApi.model.Item;
import com.tareq.restApi.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class TodoController {

    @Autowired
    private ItemRepository itemRepository;

    // For test ---
    @GetMapping("/hello")
    public String sayGreeting(){
        return "Hello User!!!";
    }

    // ✅ CREATE
    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    // ✅ READ ALL
    @GetMapping
    public List<Item> getItems() {
        return itemRepository.findAll();
    }

    // ✅ READ BY ID
    @GetMapping("/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }

    // ✅ UPDATE
    @PutMapping("/{id}")
    public Item updateItem(@PathVariable Long id, @RequestBody Item itemDetails) {
        Item item = getItemById(id);
        item.setName(itemDetails.getName());
        return itemRepository.save(item);
    }

    // ✅ DELETE
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemRepository.deleteById(id);
    }

}
