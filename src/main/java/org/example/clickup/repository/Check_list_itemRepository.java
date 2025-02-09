package org.example.clickup.repository;

import org.example.clickup.model.Check_list;
import org.example.clickup.model.Check_list_item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Check_list_itemRepository extends JpaRepository<Check_list_item, Integer> {
}
