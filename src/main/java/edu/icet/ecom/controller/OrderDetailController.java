package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.OrderDetailDto;

import edu.icet.ecom.model.dto.OrderDto;
import edu.icet.ecom.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/order_detail")
@RequiredArgsConstructor
public class OrderDetailController {
   final OrderDetailService service;
    @GetMapping("/get-all")
    public List<OrderDetailDto> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void AddOrderDetail(@RequestBody OrderDetailDto orderDetail){
        service.AddOrderDetail(orderDetail);
    }
}
