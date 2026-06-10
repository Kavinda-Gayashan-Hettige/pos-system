package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.ItemDto;

import java.util.List;

public interface ItemService {
    void AddItem(ItemDto item);

    List<ItemDto> getAll();

    void deleteItem(Integer id);
}
