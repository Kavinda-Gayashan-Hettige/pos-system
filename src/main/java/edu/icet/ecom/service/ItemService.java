package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CartItem;
import edu.icet.ecom.model.dto.ItemDto;
import edu.icet.ecom.model.entity.Item;

import java.util.List;

public interface ItemService {
    void AddItem(ItemDto item);

    List<ItemDto> getAll();

    void deleteItem(Integer id);

    Item searchItem(Integer itemCode, Object o);

    boolean updateItemQuantity(List<CartItem> cartItemObservableList);
}
