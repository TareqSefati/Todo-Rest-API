package com.tareq.restApi.repository;

import com.tareq.restApi.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
