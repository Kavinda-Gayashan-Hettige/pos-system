package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.OrderDetailDto;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetailDto> getAll();
}
