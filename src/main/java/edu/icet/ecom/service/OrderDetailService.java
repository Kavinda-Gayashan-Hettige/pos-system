package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CartItem;

import edu.icet.ecom.model.dto.OrderDto;

import java.util.List;

public interface OrderDetailService {
//    List<OrderDetailDto> getAll();

    boolean AddOrderDetail(OrderDto order,List<CartItem> cartItems);
}
