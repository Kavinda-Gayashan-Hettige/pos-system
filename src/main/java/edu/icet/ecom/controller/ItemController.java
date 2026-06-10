package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.ItemDto;
import edu.icet.ecom.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {
    final ItemService service;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void AddItem(@RequestBody ItemDto item){
        service.AddItem(item);
    }
}
