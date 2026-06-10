package edu.icet.ecom.model.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDto {
    private Integer orderId;
    private LocalDate orderDate;
    private Integer customerId;
}
