package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CartItem;
import edu.icet.ecom.model.dto.OrderDto;
import edu.icet.ecom.model.entity.Customer;
import edu.icet.ecom.model.entity.Item;


import java.sql.SQLException;
import java.util.List;

public interface PlaceOrderService {

    Customer getCustomer(String customerId);

    Item getItem(Integer itemCode);

    void placeOrder(OrderDto order, List<CartItem> cartItemObservableList) throws SQLException;
}
