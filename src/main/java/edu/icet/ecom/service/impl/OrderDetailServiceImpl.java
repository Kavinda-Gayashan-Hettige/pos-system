package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.CartItem;

import edu.icet.ecom.model.dto.OrderDto;
import edu.icet.ecom.model.entity.OrderDetail;
import edu.icet.ecom.repository.OrderDetailRepository;
import edu.icet.ecom.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {
    final OrderDetailRepository repository;
    final ModelMapper mapper;
//    @Override
//    public List<OrderDetailDto> getAll() {
//        List<OrderDetailDto> orderDetailList = new ArrayList<>();
//        List<OrderDetail> all = repository.findAll();
//
//        all.forEach(orderDetailEntity -> {
//            orderDetailList.add(mapper.map(orderDetailEntity, OrderDetailDto.class));
//        });
//
//        return orderDetailList;
//    }


    @Override
    public boolean  AddOrderDetail(OrderDto order,List<CartItem> cartItems) {
        boolean isAdd = false;

        for (CartItem cartItem:cartItems){
            try {
                isAdd = repository.addOrderDetail(
                        new OrderDetail(
                                order.getOrderId(),
                                cartItem.getItemCode(),
                                cartItem.getQuantity(),
                                cartItem.getDiscount()
                        )
                );
                if(isAdd == false) {
                    break;
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return isAdd;
    }
}
