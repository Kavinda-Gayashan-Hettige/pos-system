package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.OrderDetail;

import java.sql.SQLException;


public interface OrderDetailRepository  {

    boolean addOrderDetail(OrderDetail orderDetail) throws SQLException;


}
