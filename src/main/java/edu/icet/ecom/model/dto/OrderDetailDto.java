package edu.icet.ecom.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDto {
    private Integer orderID;
    private Integer itemCode;
    private Integer orderQty;
    private double discount;
}
