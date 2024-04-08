package com.nhnacademy.delivery.order.dto.response;

import com.nhnacademy.delivery.order.domain.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;


@Data
@Builder
@AllArgsConstructor
public class OrderResponseDto {


    private Long orderId;
    private LocalDate orderDate;
    private Order.OrderState orderState;
    private Long deliveryFee;
    private Long paymentId;
    private String adrress;
    private String receiverName;
    private Long customerNo;
    private String req;


}
