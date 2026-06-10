package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.OrderDto;
import edu.icet.ecom.model.entity.Order;

import java.util.List;

public interface OrderService {
   boolean AddOrder(OrderDto order);

    List<OrderDto> getAll();

    void deleteOrder(Integer id);

}
