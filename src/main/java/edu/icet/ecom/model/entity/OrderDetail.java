package edu.icet.ecom.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "order_detail")
public class OrderDetail {
@Id
    private Integer orderID;
    private Integer itemCode;
    private Integer orderQty;
    private double discount;
}
