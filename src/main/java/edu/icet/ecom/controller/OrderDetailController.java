package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.OrderDetailDto;

import edu.icet.ecom.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
