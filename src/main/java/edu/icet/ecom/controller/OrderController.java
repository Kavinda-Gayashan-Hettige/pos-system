package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.OrderDto;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    final OrderService service;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void AddOrder(@RequestBody OrderDto order){
        service.AddOrder(order);
    }

    @GetMapping("/get-all")
    public List<OrderDto> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable Integer id){
        service.deleteOrder(id);
    }
}
