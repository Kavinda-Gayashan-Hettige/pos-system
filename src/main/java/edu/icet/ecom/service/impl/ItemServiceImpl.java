package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.ItemDto;
import edu.icet.ecom.model.entity.Item;
import edu.icet.ecom.repository.ItemRepository;
import edu.icet.ecom.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    final ItemRepository repository;
    final ModelMapper mapper;
    @Override
    public void AddItem(ItemDto item) {
        repository.save(mapper.map(item, Item.class));
    }
}
