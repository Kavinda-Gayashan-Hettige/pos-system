package edu.icet.ecom.service.impl;

import edu.icet.ecom.model.dto.OrderDetailDto;

import edu.icet.ecom.model.entity.OrderDetail;
import edu.icet.ecom.repository.OrderDetailRepository;
import edu.icet.ecom.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {
    final OrderDetailRepository repository;
    final ModelMapper mapper;
    @Override
    public List<OrderDetailDto> getAll() {
        List<OrderDetailDto> orderDetailList = new ArrayList<>();
        List<OrderDetail> all = repository.findAll();

        all.forEach(orderDetailEntity -> {
            orderDetailList.add(mapper.map(orderDetailEntity, OrderDetailDto.class));
        });

        return orderDetailList;
    }
}
