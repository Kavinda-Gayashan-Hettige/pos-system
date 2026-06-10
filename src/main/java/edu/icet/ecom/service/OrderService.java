package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.OrderDto;

import java.util.List;

public interface OrderService {
    void AddOrder(OrderDto order);

    List<OrderDto> getAll();

    void deleteOrder(Integer id);
}
