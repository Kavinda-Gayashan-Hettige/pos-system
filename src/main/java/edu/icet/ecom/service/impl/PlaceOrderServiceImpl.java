package edu.icet.ecom.service.impl;

import edu.icet.ecom.db.DBConnection;
import edu.icet.ecom.model.dto.CartItem;
import edu.icet.ecom.model.dto.OrderDto;
import edu.icet.ecom.model.entity.Customer;
import edu.icet.ecom.model.entity.Item;
import edu.icet.ecom.service.*;
import lombok.RequiredArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
@RequiredArgsConstructor

public class PlaceOrderServiceImpl implements PlaceOrderService {

    final ItemService itemService ;
    final CustomerService customerService ;

    @Override
    public Customer getCustomer(String customerId) {
        return customerService.getCustomer(customerId);
    }

    @Override
    public Item getItem(Integer itemCode) {
        return itemService.searchItem(itemCode, null);
    }


    final OrderService orderService ;
    final OrderDetailService orderDetailsService ;


    @Override
    public void placeOrder(OrderDto order, List<CartItem> cartItemObservableList) throws SQLException {

        Connection connection = DBConnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);

            boolean isAddOrder = orderService.AddOrder(order);
            if(isAddOrder){
                boolean isAddOrderDeatils = orderDetailsService.AddOrderDetail(order,cartItemObservableList);
//            System.out.println("Order Details Added: "+isAddOrderDeatils);
                if(isAddOrderDeatils){
                    boolean isUpdateItem = itemService.updateItemQuantity(cartItemObservableList);
//                System.out.println("Item Quantity Updated: "+isUpdateItem);
                    if(isUpdateItem){
                        connection.commit();
                    }
                }
            }
        } catch (SQLException e) {
            connection.rollback();
            throw new RuntimeException(e);
        }finally {
            connection.setAutoCommit(true);
        }


    }
}
