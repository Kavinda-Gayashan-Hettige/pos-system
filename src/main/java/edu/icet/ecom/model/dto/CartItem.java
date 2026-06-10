package edu.icet.ecom.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CartItem {

        private Integer itemCode;
        private String description;
        private int quantity;
        private double unitPrice;
        private double discount;
        private double totalPrice;

}
