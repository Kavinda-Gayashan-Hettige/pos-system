package edu.icet.ecom.service.impl;


import edu.icet.ecom.model.dto.OrderDto;

import edu.icet.ecom.model.entity.Order;
import edu.icet.ecom.repository.OrderRepository;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    final ModelMapper mapper;
    final OrderRepository repository;
    @Override
    public void AddOrder(OrderDto order) {

        repository.save(mapper.map(order, Order.class));
    }

    @Override
    public List<OrderDto> getAll() {
        List<OrderDto> orderList = new ArrayList<>();
        List<Order> all = repository.findAll();

        all.forEach(orderEntity -> {
            orderList.add(mapper.map(orderEntity, OrderDto.class));
        });

        return orderList;
    }

    @Override
    public void deleteOrder(Integer id) {
        repository.deleteById(id);
    }
}
