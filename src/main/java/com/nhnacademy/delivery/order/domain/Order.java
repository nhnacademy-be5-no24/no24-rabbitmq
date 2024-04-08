package com.nhnacademy.delivery.order.domain;

import com.nhnacademy.delivery.customer.domain.Customer;
import com.nhnacademy.delivery.payment.domain.Payment;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * 주문(Order) 테이블.
 *
 * @author : 박동희
 * @date : 2024-04-01
 *
 **/
@Entity
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    public enum OrderState {
        WAITING, SHIPPING, COMPLETED, RETURNS, ORDER_CANCELED, PURCHASE_CONFIRMED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Column(name = "order_state", nullable = false)
    private OrderState orderState;

    @Column(name = "delivery_fee", nullable = false)
    private Long deliveryFee;

    @ManyToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "customer_no", nullable = false)
    private Customer customer;

    @Column(name = "receiver_name", nullable = false)
    private String receiverName;

    @Column(name = "receiver_phone_number", nullable = false)
    private String receiverPhoneNumber;

    @Column(name = "zipcode", nullable = false)
    private String zipcode;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "address_detail", nullable = false)
    private String addressDetail;

    @Column(name = "req")
    private String req;


}