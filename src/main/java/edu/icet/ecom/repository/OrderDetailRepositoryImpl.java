package edu.icet.ecom.repository;

import edu.icet.ecom.db.DBConnection;
import edu.icet.ecom.model.entity.OrderDetail;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class OrderDetailRepositoryImpl implements OrderDetailRepository{
    @Override
    public boolean addOrderDetail(OrderDetail orderDetail) throws SQLException {
        String SQL = "INSERT INTO orderdetail Values(? ,? ,? ,?)";

        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement psTm = connection.prepareStatement(SQL);
        psTm.setObject(1,orderDetail.getOrderID());
        psTm.setObject(2,orderDetail.getItemCode());
        psTm.setObject(3,orderDetail.getOrderQty());
        psTm.setObject(4,orderDetail.getDiscount());

        return psTm.executeUpdate() > 0;
    }
}
